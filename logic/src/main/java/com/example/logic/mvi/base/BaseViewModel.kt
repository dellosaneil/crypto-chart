package com.example.logic.mvi.base

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.logic.mvi.base.interfaces.*
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.flow.*
import kotlinx.coroutines.launch

@FlowPreview
@ExperimentalCoroutinesApi
abstract class BaseViewModel<Intent : MviIntent, Action : MviAction, ViewEffect : MviViewEffect, ViewState : MviViewState, Result : MviResult> (
    private val filter: MviActionFilter<Intent, Action>,
    private val viewEffectSender: MviViewEffectSender<Result, ViewEffect>,
    private val reducer: MviReducer<Result, ViewState>,
) :
    ViewModel() {

    private val initialState: ViewState by lazy { initialState() }
    abstract fun initialState(): ViewState

    fun getViewEffect() = viewEffectSender.getViewEffect()

    fun getCurrentState() = viewState.value

    private val _viewState: MutableStateFlow<ViewState> = MutableStateFlow(initialState)
    val viewState = _viewState.asStateFlow()

    private val _intent: MutableSharedFlow<Intent> = MutableSharedFlow()

    fun emitIntent(intent: Intent) {
        viewModelScope.launch { _intent.emit(intent) }
    }

   abstract val processor : BaseActionProcessor<Action, Result>


    @FlowPreview
    fun initializeFlow() {
        _intent
            .map(filter::actionFromIntent)
            .shareIn(scope = viewModelScope, started = SharingStarted.Eagerly)
            .flatMapMerge(transform = processor::processAction)
            .onEach {
                viewEffectSender.handleViewEffect(it)
            }
            .scan(initialState, reducer::reduce)
            .onEach { newState ->
                _viewState.value = newState
            }
            .launchIn(viewModelScope)
    }
}

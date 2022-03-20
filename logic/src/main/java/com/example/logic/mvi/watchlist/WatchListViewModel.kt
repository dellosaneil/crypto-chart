package com.example.logic.mvi.watchlist

import com.example.di.IoDispatcher
import com.example.logic.mvi.base.BaseActionProcessor
import com.example.logic.mvi.base.BaseViewModel
import com.example.network.usecase.RetrieveCoinList
import com.example.usecase.MapCoinList
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.FlowPreview
import javax.inject.Inject

@OptIn(FlowPreview::class, kotlinx.coroutines.ExperimentalCoroutinesApi::class)
@HiltViewModel
class WatchListViewModel @Inject constructor(
    @IoDispatcher
    coroutineDispatcher: CoroutineDispatcher,
    filter: WatchListActionFilter,
    viewEffectSender: WatchListViewEffectSender,
    reducer: WatchListReducer,
    retrieveCoinList: RetrieveCoinList,
    mapCoinList: MapCoinList,
) : BaseViewModel<WatchListIntent, WatchListAction, WatchListViewEffect, WatchListViewState, WatchListResult>(
    filter = filter,
    viewEffectSender = viewEffectSender,
    reducer = reducer,
) {
    override fun initialState() = WatchListViewState.idle()

    override val processor: BaseActionProcessor<WatchListAction, WatchListResult> =
        WatchListActionProcessor(
            coroutineDispatcher = coroutineDispatcher,
            retrieveCoinList = retrieveCoinList,
            mapCoinList = mapCoinList,
        )

    init {
        initializeFlow()
    }
}

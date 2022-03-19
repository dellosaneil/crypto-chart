package com.example.logic.mvi.base.interfaces

import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow

interface MviViewEffectSender<Result : MviResult, ViewEffect : MviViewEffect> {
    val viewEffect: MutableSharedFlow<ViewEffect>
    suspend fun handleViewEffect(result: Result)
    fun getViewEffect(): SharedFlow<ViewEffect>
}

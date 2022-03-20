package com.example.logic.mvi.watchlist.impl

import com.example.logic.mvi.watchlist.WatchListResult
import com.example.logic.mvi.watchlist.WatchListViewEffect
import com.example.logic.mvi.watchlist.WatchListViewEffectSender
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.SharedFlow
import javax.inject.Inject

class WatchListViewEffectSenderImpl @Inject constructor() : WatchListViewEffectSender {
    override val viewEffect = MutableSharedFlow<WatchListViewEffect>()

    override suspend fun handleViewEffect(result: WatchListResult) {
        when(result){

        }
    }

    override fun getViewEffect(): SharedFlow<WatchListViewEffect> {
        return viewEffect
    }
}

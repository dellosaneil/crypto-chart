package com.example.logic.mvi.watchlist.impl

import com.example.logic.mvi.watchlist.WatchListAction
import com.example.logic.mvi.watchlist.WatchListActionFilter
import com.example.logic.mvi.watchlist.WatchListIntent
import javax.inject.Inject

class WatchListActionFilterImpl @Inject constructor(): WatchListActionFilter {
    override fun actionFromIntent(intent: WatchListIntent): WatchListAction {
        return when(intent) {
            is WatchListIntent.LoadCoinsListIntent -> WatchListAction.LoadCoinsListAction
        }
    }
}

package com.example.logic.mvi.watchlist.impl

import com.example.logic.mvi.watchlist.WatchListReducer
import com.example.logic.mvi.watchlist.WatchListResult
import com.example.logic.mvi.watchlist.WatchListViewState
import javax.inject.Inject

class WatchListReducerImpl @Inject constructor(): WatchListReducer {
    override fun reduce(previous: WatchListViewState, result: WatchListResult): WatchListViewState {
        return when(result) {
            is WatchListResult.LoadCoinsList -> {
                when(result) {
                    is WatchListResult.LoadCoinsList.Error -> previous.copy(error = result.error)
                    WatchListResult.LoadCoinsList.Loading -> previous.copy(error = null,)
                    is WatchListResult.LoadCoinsList.Success -> previous.copy(error = null, coinsList = result.items,)
                }
            }
        }
    }
}

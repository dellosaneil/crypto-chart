package com.example.logic.mvi.watchlist

import com.example.item.coinlist.CoinDetail
import com.example.logic.mvi.base.interfaces.MviViewState

data class WatchListViewState(
    val error: Throwable?,
    val coinsList: List<CoinDetail>,
) : MviViewState{
    companion object {
        fun idle() : WatchListViewState {
            return WatchListViewState(
                error = null,
                coinsList = listOf(),
            )
        }
    }
}

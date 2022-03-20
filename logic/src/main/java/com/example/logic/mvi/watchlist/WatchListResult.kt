package com.example.logic.mvi.watchlist

import com.example.item.coinlist.CoinDetail
import com.example.logic.mvi.base.interfaces.MviResult

sealed class WatchListResult: MviResult {

    sealed class LoadCoinsList: WatchListResult() {
        data class Success(val items: List<CoinDetail>) : LoadCoinsList()
        object Loading: LoadCoinsList()
        data class Error(val error: Throwable) : LoadCoinsList()
    }
}

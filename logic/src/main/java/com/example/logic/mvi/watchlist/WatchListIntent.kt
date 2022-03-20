package com.example.logic.mvi.watchlist

import com.example.item.coinlist.CoinDetail
import com.example.logic.mvi.base.interfaces.MviIntent

sealed class WatchListIntent : MviIntent {
    object LoadCoinsListIntent : WatchListIntent()
    data class SearchCoinIntent(
        val items: List<CoinDetail>, val term: String,
    ) : WatchListIntent()
}

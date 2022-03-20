package com.example.logic.mvi.watchlist

import com.example.item.coinlist.CoinDetail
import com.example.logic.mvi.base.interfaces.MviAction

sealed class WatchListAction : MviAction {
    object LoadCoinsListAction : WatchListAction()
    data class SearchCoinAction(val items: List<CoinDetail>, val term: String) :
        WatchListAction()
}

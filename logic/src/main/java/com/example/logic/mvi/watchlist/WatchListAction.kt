package com.example.logic.mvi.watchlist

import com.example.logic.mvi.base.interfaces.MviAction

sealed class WatchListAction: MviAction {
    object LoadCoinsListAction: WatchListAction()
}

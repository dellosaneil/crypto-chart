package com.example.logic.mvi.watchlist

import com.example.logic.mvi.base.interfaces.MviIntent

sealed class WatchListIntent: MviIntent {
    object LoadCoinsListIntent: WatchListIntent()
}

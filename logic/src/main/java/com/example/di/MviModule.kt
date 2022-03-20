package com.example.di

import com.example.logic.mvi.watchlist.WatchListActionFilter
import com.example.logic.mvi.watchlist.WatchListReducer
import com.example.logic.mvi.watchlist.WatchListViewEffectSender
import com.example.logic.mvi.watchlist.impl.WatchListActionFilterImpl
import com.example.logic.mvi.watchlist.impl.WatchListReducerImpl
import com.example.logic.mvi.watchlist.impl.WatchListViewEffectSenderImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class MviModule {

    @Binds
    abstract fun bindWatchListActionFilter(impl: WatchListActionFilterImpl) : WatchListActionFilter

    @Binds
    abstract fun bindWatchListReducer(impl: WatchListReducerImpl) : WatchListReducer

    @Binds
    abstract fun bindWatchListViewEffectSender(impl: WatchListViewEffectSenderImpl) : WatchListViewEffectSender

}

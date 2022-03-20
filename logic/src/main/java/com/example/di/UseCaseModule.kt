package com.example.di

import com.example.usecase.MapCoinList
import com.example.usecase.impl.MapCoinListImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindMapCoinList(impl: MapCoinListImpl) : MapCoinList
}

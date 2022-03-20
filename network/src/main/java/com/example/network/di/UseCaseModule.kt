package com.example.network.di

import com.example.network.usecase.RetrieveCoinList
import com.example.network.usecase.impl.RetrieveCoinListImpl
import com.example.network.util.NetworkConfig
import com.example.network.util.impl.NetworkConfigImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class UseCaseModule {

    @Binds
    abstract fun bindNetworkConfig(impl: NetworkConfigImpl) : NetworkConfig

    @Binds
    abstract fun bindRetrieveCoinList(impl: RetrieveCoinListImpl) : RetrieveCoinList
}

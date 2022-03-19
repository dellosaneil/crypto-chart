package com.example.network.di

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

}

package com.example.network.di

import com.example.network.repository.NetworkRepository
import com.example.network.repository.impl.NetworkRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
abstract class RepositoryModule {

    @Binds
    abstract fun bindNetworkRepository(impl: NetworkRepositoryImpl) : NetworkRepository
}

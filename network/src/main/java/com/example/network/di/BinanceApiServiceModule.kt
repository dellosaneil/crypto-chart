package com.example.network.di

import com.example.network.service.BinanceApiService
import com.example.network.util.NetworkConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object BinanceApiServiceModule {

    @Provides
    fun provideNetworkService(networkConfig: NetworkConfig, okHttpClient: OkHttpClient) : BinanceApiService {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(networkConfig.baseUrl)
            .client(okHttpClient)
            .build()
            .create(BinanceApiService::class.java)
    }
}

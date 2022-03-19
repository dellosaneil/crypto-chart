package com.example.network.di

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient


@Module
@InstallIn(SingletonComponent::class)
object NetworkModule {

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val okHttpClient = OkHttpClient.Builder()
        okHttpClient.addInterceptor { chain ->
            val requestBuilder = chain.request().newBuilder()
                .build()
            chain.proceed(requestBuilder)
        }
        return okHttpClient.build()
    }

}

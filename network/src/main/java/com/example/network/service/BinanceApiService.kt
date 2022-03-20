package com.example.network.service

import com.example.network.model.response.coinlist.CoinDataResponse
import retrofit2.http.GET

interface BinanceApiService {

    @GET("composite/v1/public/marketing/symbol/list")
    suspend fun retrieveCoinList() : CoinDataResponse

}

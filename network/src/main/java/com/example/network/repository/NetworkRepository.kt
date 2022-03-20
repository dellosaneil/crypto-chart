package com.example.network.repository

import com.example.network.model.schema.CoinDetailSchema

interface NetworkRepository {

    suspend fun retrieveCoinList() : List<CoinDetailSchema>
}

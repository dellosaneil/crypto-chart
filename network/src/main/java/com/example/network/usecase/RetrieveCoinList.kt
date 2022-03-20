package com.example.network.usecase

import com.example.network.model.schema.CoinDetailSchema

interface RetrieveCoinList {
    suspend operator fun invoke() : List<CoinDetailSchema>
}

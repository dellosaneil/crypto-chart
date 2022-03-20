package com.example.usecase

import com.example.item.coinlist.CoinDetail
import com.example.network.model.schema.CoinDetailSchema

interface MapCoinList {
    operator fun invoke(schema: List<CoinDetailSchema>) : List<CoinDetail>
}

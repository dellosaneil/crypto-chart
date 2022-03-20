package com.example.usecase.impl

import com.example.item.coinlist.CoinDetail
import com.example.network.model.schema.CoinDetailSchema
import com.example.usecase.MapCoinList
import javax.inject.Inject

class MapCoinListImpl @Inject constructor() : MapCoinList {
    override fun invoke(schema: List<CoinDetailSchema>): List<CoinDetail> {
        return schema.map { coin ->
            CoinDetail(
                id = coin.id,
                name = coin.name,
                fullName = coin.fullName,
                symbol = coin.symbol,
                circulatingSupply = coin.circulatingSupply,
                maxSupply = coin.maxSupply,
                totalSupply = coin.totalSupply,
                volume = coin.volume,
                rank = coin.rank,
                dayChange = coin.dayChange,
                dayChangeAmount = coin.dayChangeAmount,
                marketCap = coin.marketCap,
                price = coin.price,
                slug = coin.slug ?: "",
            )
        }
    }
}

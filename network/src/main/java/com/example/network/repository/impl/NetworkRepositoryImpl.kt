package com.example.network.repository.impl

import com.example.network.model.schema.CoinDetailSchema
import com.example.network.repository.NetworkRepository
import com.example.network.service.BinanceApiService
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val service: BinanceApiService,
): NetworkRepository {
    override suspend fun retrieveCoinList(): List<CoinDetailSchema> {
        return service.retrieveCoinList().data.map { coin ->
            CoinDetailSchema(
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
                slug = coin.slug,
            )
        }
    }

}

package com.example.network.usecase.impl

import com.example.network.model.schema.CoinDetailSchema
import com.example.network.repository.NetworkRepository
import com.example.network.usecase.RetrieveCoinList
import javax.inject.Inject

class RetrieveCoinListImpl @Inject constructor(
    private val repository: NetworkRepository,
): RetrieveCoinList {
    override suspend fun invoke(): List<CoinDetailSchema> {
        return repository.retrieveCoinList()
    }
}

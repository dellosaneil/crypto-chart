package com.example.network.repository.impl

import com.example.network.repository.NetworkRepository
import com.example.network.service.BinanceApiService
import javax.inject.Inject

class NetworkRepositoryImpl @Inject constructor(
    private val service: BinanceApiService,
): NetworkRepository {

}

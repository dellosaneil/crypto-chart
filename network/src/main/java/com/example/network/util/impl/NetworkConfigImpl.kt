package com.example.network.util.impl

import com.example.network.util.NetworkConfig
import javax.inject.Inject

class NetworkConfigImpl @Inject constructor(): NetworkConfig {
    override val baseUrl: String
        get() = "https://www.binance.com/bapi/"
}

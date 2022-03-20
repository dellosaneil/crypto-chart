package com.example.item.coinlist

data class CoinDetail(
    val id: Int,
    val name: String,
    val fullName: String,
    val symbol: String,
    val circulatingSupply: Long,
    val maxSupply: Long?,
    val totalSupply: Long,
    val volume: Double,
    val rank: Int,
    val dayChange: Double,
    val dayChangeAmount: Double,
    val marketCap: Double,
    val price: Double,
    val slug: String,
)

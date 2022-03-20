package com.example.network.model.response.coinlist

data class CoinDataResponse(
    val code: String,
    val message: Any,
    val messageDetail: Any,
    val `data`: List<CoinDetailResponse>,
    val success: Boolean
)

package com.fr1x3.cryptocurrency.models

import com.google.gson.annotations.SerializedName

data class Coins(
        @SerializedName("name") val name: String,
        @SerializedName("synmbol") val symbol: String,
        @SerializedName("price_usd") val price: Double,
        @SerializedName("rank") val rank: Int,
        @SerializedName("percent_change_7d") val percentage: Float
)
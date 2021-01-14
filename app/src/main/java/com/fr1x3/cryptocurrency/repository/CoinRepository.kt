package com.fr1x3.cryptocurrency.repository

import com.fr1x3.cryptocurrency.network.RetrofitInstance

class CoinRepository {
    // get all coins
    suspend fun getAllCoins(startPaginateAt: Int) =
        RetrofitInstance.api.getAllCoins(startPaginateAt)

}
package com.fr1x3.cryptocurrency.network

import com.fr1x3.cryptocurrency.models.CoinsResponse
import com.fr1x3.cryptocurrency.utils.Constants.Companion.PAGE_LIMIT
import kotlinx.coroutines.Deferred
import retrofit2.Response

import retrofit2.http.GET
import retrofit2.http.Query

interface CoinsApi {


    // get information on all the coins
    @GET("tickers/")
    suspend fun getAllCoins(
        @Query("start") startPaginateAt: Int = 0,
        @Query("limit") paginateLimit: Int = PAGE_LIMIT
    ) : Response<CoinsResponse>

}
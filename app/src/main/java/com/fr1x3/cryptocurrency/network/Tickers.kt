package com.fr1x3.cryptocurrency.network

import com.fr1x3.cryptocurrency.models.CoinsResponse
import kotlinx.coroutines.Deferred
import retrofit2.Response

import retrofit2.http.GET

interface Tickers {


    // get information on all the coins
    @GET("Tickers/")
    fun getAllCoins() : Deferred<Response<CoinsResponse>>




}
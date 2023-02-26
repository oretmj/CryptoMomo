package com.example.cryptomomo.viewmodel

import retrofit2.Response
import retrofit2.http.GET
import com.example.cryptomomo.model.CryptoModel

interface CryptoApi {
    @GET("coins/markets?vs_currency=clp&order=market_cap_desc&per_page=10&page=1")
    suspend fun getCryptosData(): Response<List<CryptoModel>>
}
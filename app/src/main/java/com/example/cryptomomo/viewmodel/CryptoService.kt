package com.example.cryptomomo.viewmodel

import com.example.cryptomomo.model.CryptoModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Response

class CryptoService {
    private val retrofit = RetrofitHelper.getRetrofit()

    suspend fun getCryptos():List<CryptoModel>{
        return withContext(Dispatchers.IO){
            val response:Response<List<CryptoModel>> = retrofit.create(CryptoApi::class.java).getCryptosData()
            response.body() ?: emptyList()
        }
    }
}
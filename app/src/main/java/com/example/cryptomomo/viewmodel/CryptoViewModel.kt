package com.example.cryptomomo.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.cryptomomo.model.CryptoModel
import com.example.cryptomomo.model.CryptoProvider
import kotlinx.coroutines.launch

class CryptoViewModel: ViewModel() {
    val cryptoModel = MutableLiveData<List<CryptoModel>>()

    fun randomCrypto(){
        val currentCryptos = CryptoProvider.random()
        cryptoModel.postValue(currentCryptos)
    }

     fun getCryptos() {
         viewModelScope.launch {
             val result = CryptoService().getCryptos()

             if (!result.isNullOrEmpty()) {
                 cryptoModel.postValue(result)
             }
         }
    }
}
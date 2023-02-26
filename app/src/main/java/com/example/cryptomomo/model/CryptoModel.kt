package com.example.cryptomomo.model

import  com.google.gson.annotations.SerializedName

data class CryptoModel (@SerializedName("name") val name: String, @SerializedName("current_price") val current_price: String, @SerializedName("image") val image: String) {
}
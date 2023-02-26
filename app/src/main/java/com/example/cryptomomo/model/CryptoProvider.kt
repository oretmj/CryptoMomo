package com.example.cryptomomo.model

class CryptoProvider {
    companion object {

        fun random(): List<CryptoModel> {
            //val random = (0..7).random()
            return crypto.shuffled()
        }

        private val crypto = listOf<CryptoModel>(
            CryptoModel("Bitcoin", "1000000", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png"),
            CryptoModel("Ethereum", "100000", "https://upload.wikimedia.org/wikipedia/commons/thumb/0/05/Ethereum_logo_2014.svg/1200px-Ethereum_logo_2014.svg.png"),
            CryptoModel("Ripple", "10000", "https://upload.wikimedia.org/wikipedia/commons/thumb/8/87/Ripple_logo.svg/1200px-Ripple_logo.svg.png"),
            CryptoModel("Bitcoin Cash", "1000", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png"),
            CryptoModel("Litecoin", "100", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png"),
            CryptoModel("EOS", "10", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png"),
            CryptoModel("Binance Coin", "1", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png"),
            CryptoModel("Stellar", "0.1", "https://upload.wikimedia.org/wikipedia/commons/thumb/4/46/Bitcoin.svg/1200px-Bitcoin.svg.png"),
        )
    }
}
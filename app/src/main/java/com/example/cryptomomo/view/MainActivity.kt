package com.example.cryptomomo.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import android.widget.ListView
import androidx.activity.viewModels
import androidx.lifecycle.Observer
import com.example.cryptomomo.databinding.ActivityMainBinding
import com.example.cryptomomo.viewmodel.CryptoViewModel
import com.example.cryptomomo.model.CryptoModel
import com.example.cryptomomo.view.CryptoAdapter


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    private lateinit var listView: ListView
    var arrayList = ArrayList<CryptoModel>()
    var adapter: CryptoAdapter? = null


    private val cryptoViewModel:CryptoViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        cryptoViewModel.cryptoModel.observe(this, Observer {
            listView = binding.listView
            arrayList.clear()
            arrayList.addAll(it)
            adapter = CryptoAdapter(this, arrayList)
            listView.adapter = adapter
        })

        refreshApp()
    }

    private fun refreshApp() {
        binding.swipeRefreshLayout.setOnRefreshListener {
            cryptoViewModel.getCryptos()
            Toast.makeText(this, "Refreshing...", Toast.LENGTH_SHORT).show()
            binding.swipeRefreshLayout.isRefreshing = false
        }
    }
}
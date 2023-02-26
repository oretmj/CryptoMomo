package com.example.cryptomomo.view

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView
import com.example.cryptomomo.R
import com.example.cryptomomo.model.CryptoModel
import com.squareup.picasso.Picasso
import java.text.NumberFormat
import java.util.*

class CryptoAdapter(private val context: Context, private val arrayList: java.util.ArrayList<CryptoModel>) : BaseAdapter() {
    private lateinit var crypto_name: TextView
    private lateinit var crypto_price: TextView
    private lateinit var crypto_image: ImageView
    override fun getCount(): Int {
        return arrayList.size
    }
    override fun getItem(position: Int): Any {
        return position
    }
    override fun getItemId(position: Int): Long {
        return position.toLong()
    }
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View? {
        var convertView = convertView
        convertView = LayoutInflater.from(context).inflate(R.layout.with_cardview, parent, false)
        crypto_name = convertView.findViewById(R.id.crypto_name)
        crypto_price = convertView.findViewById(R.id.crypto_price)
        crypto_image = convertView.findViewById(R.id.crypto_image)
        crypto_name.text = arrayList[position].name
        //crypto_price.text = arrayList[position].current_price + " CLP"
        crypto_price.text = NumberFormat.getNumberInstance(Locale.US).format(arrayList[position].current_price.toDouble()) + " CLP"
        Picasso.get().load(arrayList[position].image).into(crypto_image)
        return convertView
    }
}
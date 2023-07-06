package com.example.countrylist

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.countrylist.databinding.CountryitemBinding

class CountryAdapter : RecyclerView.Adapter<CountryAdapter.CountryHolder>() {

    lateinit var context: Context
    var list = ArrayList<List<CountryModel>>()


    class CountryHolder(itemView: CountryitemBinding) : ViewHolder(itemView.root) {
        var binding = itemView
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CountryHolder {
        context = parent.context
        var binding = CountryitemBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return CountryHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: CountryHolder, position: Int) {
        holder.binding.apply {
            list.get(position)?.
        }
    }
}
package com.example.explorr.mood

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explorr.core.data.source.response.listhotel.Response
import com.example.explorr.databinding.ItemCardHotelBinding
import com.example.explorr.detail.DetailHotelActivity
import com.example.explorr.explore.ListHotelAdapter

class MoodHotelAdapter : RecyclerView.Adapter<MoodHotelAdapter.ViewHolder>(){

    private val list = ArrayList<Response>()

    inner class ViewHolder(private val binding: ItemCardHotelBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(listHotel:Response){
            with(binding){
                //memasukan data response ke dalam card
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context,DetailHotelActivity::class.java)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val cardHotelBinding = ItemCardHotelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(cardHotelBinding)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return list.size
    }


}
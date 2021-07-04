package com.example.explorr.explore

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explorr.core.data.source.response.listhotel.Response
import com.example.explorr.databinding.ItemCardHotelBinding

class ListHotelAdapter(private val response: Response) : RecyclerView.Adapter<ListHotelAdapter.ListHotelViewHolder>() {

    private val list = ArrayList<Response>()

    fun setResponse(listHotel: List<Response>?) {
        list.clear()
        if (listHotel == null) return
        this.list.addAll(listHotel)
        this.notifyDataSetChanged()
    }

    class ListHotelViewHolder (private val binding: ItemCardHotelBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(listHotel: Response){
            // masukan mapping response ke dalam a
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHotelViewHolder {
        val cardHotelBinding = ItemCardHotelBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ListHotelViewHolder(cardHotelBinding)
    }

    override fun onBindViewHolder(holder: ListHotelViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
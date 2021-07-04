package com.example.explorr.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explorr.databinding.ItemFacilityBinding
import com.example.explorr.databinding.ItemRoomsBinding

class DetailAdapter : RecyclerView.Adapter<DetailAdapter.RoomViewHolder>() {

    private val list = ArrayList<RoomHotelEntity>()

    class RoomViewHolder(private val binding: ItemRoomsBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(room : RoomHotelEntity){
            with(binding){
                //generate atribut room masing-masing
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RoomViewHolder {
        val itemRoomBinding = ItemRoomsBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return RoomViewHolder(itemRoomBinding)
    }

    override fun onBindViewHolder(holder: RoomViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
       return list.size
    }
}
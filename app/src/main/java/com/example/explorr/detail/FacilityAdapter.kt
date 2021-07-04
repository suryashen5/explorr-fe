package com.example.explorr.detail

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explorr.core.data.source.FacilityResponse
import com.example.explorr.databinding.ItemCardHotelBinding
import com.example.explorr.databinding.ItemFacilityBinding
import com.example.explorr.explore.ListHotelAdapter

class FacilityAdapter : RecyclerView.Adapter<FacilityAdapter.FaciViewHolder>() {

    private val list = ArrayList<FacilityResponse>()

    class FaciViewHolder (private val binding: ItemFacilityBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(faci : FacilityResponse){
            with(binding){
                // generate Facility
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FaciViewHolder {
        val itemFacilityBinding = ItemFacilityBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return FaciViewHolder(itemFacilityBinding)
    }

    override fun onBindViewHolder(holder: FaciViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
       return list.size
    }
}
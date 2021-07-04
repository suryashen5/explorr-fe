package com.example.explorr.Home

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explorr.core.data.source.remote.response.CategoryEntity
import com.example.explorr.core.data.source.remote.response.Data
import com.example.explorr.core.data.source.remote.response.PhotoEntity
import com.example.explorr.databinding.ItemCategoryBinding
import com.example.explorr.databinding.ItemGridPhotoBinding

class ImagesAdapter : RecyclerView.Adapter<ImagesAdapter.ImagesViewHolder>(){

    private val list = Data.getAllPhoto()

    inner class ImagesViewHolder (private val binding : ItemGridPhotoBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(photo : PhotoEntity){
            with(binding){
                gridPhotoImg.setImageResource(photo.picture)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ImagesViewHolder {
        val imageBinding = ItemGridPhotoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ImagesViewHolder(imageBinding)
    }

    override fun onBindViewHolder(holder: ImagesViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return Data.getAllCategory().size
    }


}
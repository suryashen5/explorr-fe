package com.example.explorr.Home

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.explorr.core.data.source.remote.response.CategoryEntity
import com.example.explorr.core.data.source.remote.response.Data
import com.example.explorr.databinding.ItemCategoryBinding
import com.example.explorr.explore.ExploreFragment

class HomeAdapter :RecyclerView.Adapter<HomeAdapter.HomeViewHolder>() {

    private val list = Data.getAllCategory()

    inner class HomeViewHolder (private val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(category : CategoryEntity){
            with(binding){
                tvTitleCategory.text = category.hastagsName
                circleImageCategory.setBackgroundResource(category.hastagsImg)
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, ExploreFragment::class.java)
                intent.putExtra(ExploreFragment.EXTRA_TAGS,category.hastagsName)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): HomeViewHolder {
        val categoryBinding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return HomeViewHolder(categoryBinding)
    }

    override fun onBindViewHolder(holder: HomeViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return Data.getAllCategory().size
    }
}
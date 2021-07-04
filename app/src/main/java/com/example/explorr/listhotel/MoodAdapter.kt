package com.example.explorr.listhotel

import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.explorr.core.data.source.CategoryEntity
import com.example.explorr.core.data.source.Data
import com.example.explorr.databinding.ItemCardHotelBinding
import com.example.explorr.databinding.ItemCategoryBinding
import com.example.explorr.explore.ListHotelAdapter
import com.example.explorr.mood.MoodHotelActivity
import java.util.*

class MoodAdapter : RecyclerView.Adapter<MoodAdapter.MoodViewHolder>(){

    private val list = Data.getAllCategory()

    class MoodViewHolder (private val binding: ItemCategoryBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(category : CategoryEntity){
            with(binding){
                tvTitleCategory.text = category.hastagsName
                circleImageCategory.setImageResource(category.hastagsImg)
            }

            itemView.setOnClickListener {
                val intent = Intent(itemView.context, MoodHotelActivity::class.java)
                intent.putExtra("mood-key", category.hastagsName)
                itemView.context.startActivity(intent)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoodViewHolder {
        val categoryBinding = ItemCategoryBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return MoodViewHolder(categoryBinding)
    }

    override fun onBindViewHolder(holder: MoodViewHolder, position: Int) {
        val items = list[position]
        holder.bind(items)
    }

    override fun getItemCount(): Int {
        return list.size
    }
}
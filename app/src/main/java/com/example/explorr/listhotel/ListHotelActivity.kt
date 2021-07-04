package com.example.explorr.listhotel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.explorr.Home.ImagesAdapter
import com.example.explorr.R
import com.example.explorr.databinding.ActivityListHotelBinding

class ListHotelActivity : AppCompatActivity() {

    private lateinit var binding : ActivityListHotelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListHotelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val categoryAdapter = MoodAdapter()
        with(binding.rvCategory) {
            layoutManager = GridLayoutManager(context,2, androidx.recyclerview.widget.LinearLayoutManager.VERTICAL, false)
            setHasFixedSize(true)
            adapter = categoryAdapter
        }

    }
}
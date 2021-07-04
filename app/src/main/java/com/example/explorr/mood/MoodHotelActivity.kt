package com.example.explorr.mood

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.explorr.Home.ImagesAdapter
import com.example.explorr.R
import com.example.explorr.databinding.ActivityMoodHotelBinding

class MoodHotelActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMoodHotelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMoodHotelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val hotelAdapter = MoodHotelAdapter()
        with(binding.rvHotels) {
            layoutManager = LinearLayoutManager(context)
            setHasFixedSize(true)
            adapter = hotelAdapter
        }
    }
}
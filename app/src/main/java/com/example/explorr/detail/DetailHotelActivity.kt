package com.example.explorr.detail

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.explorr.R
import com.example.explorr.databinding.ActivityDetailHotelBinding
import com.example.explorr.transaction.TransactionActivity
import org.koin.android.ext.android.bind

class DetailHotelActivity : AppCompatActivity() {

    private lateinit var binding : ActivityDetailHotelBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailHotelBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnOpenMaps.setOnClickListener {
            val intent = Intent(this@DetailHotelActivity,TransactionActivity::class.java)
            startActivity(intent)
        }

    }
}
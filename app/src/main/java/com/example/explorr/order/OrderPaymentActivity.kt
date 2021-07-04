package com.example.explorr.order

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.explorr.R
import com.example.explorr.databinding.ActivityOrderPaymentBinding
import com.example.explorr.databinding.ActivityTransactionBinding
import com.example.explorr.review.ReviewActivity
import org.koin.android.ext.android.bind

class OrderPaymentActivity : AppCompatActivity() {

    private lateinit var binding: ActivityOrderPaymentBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityOrderPaymentBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.continueToReview.setOnClickListener {
            val intent = Intent(this@OrderPaymentActivity, ReviewActivity::class.java)
            startActivity(intent)
        }
    }
}
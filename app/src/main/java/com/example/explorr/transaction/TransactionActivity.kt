package com.example.explorr.transaction

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.example.explorr.R
import com.example.explorr.databinding.ActivityTransactionBinding
import com.example.explorr.order.OrderPaymentActivity
import org.koin.android.ext.android.bind

class TransactionActivity : AppCompatActivity() {

    private lateinit var binding: ActivityTransactionBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityTransactionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnContinue.setOnClickListener {
            val intent = Intent(this@TransactionActivity, OrderPaymentActivity::class.java)
            startActivity(intent)
        }

    }

}
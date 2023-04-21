package com.example.simplechat

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simplechat.databinding.ActivityCahtBinding

class CahtActivity : AppCompatActivity() {
    lateinit var binding: ActivityCahtBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityCahtBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}
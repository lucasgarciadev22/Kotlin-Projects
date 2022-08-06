package com.example.simulator

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simulator.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDetailBinding //lateinit porque não é inicializada no construtor

    @SuppressLint("RestrictedApi")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root) //seta a binding view

        setSupportActionBar(binding.toolbar)
        supportActionBar?.setDefaultDisplayHomeAsUpEnabled(true)

    }
}
package com.example.gasto_de_viagem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.gasto_de_viagem.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }
}
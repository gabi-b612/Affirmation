package com.example.affirmation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.affirmation.adapter.ItemAdapter
import com.example.affirmation.databinding.ActivityMainBinding
import com.example.affirmation.data.Datasource

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

// Initialize data.
        val myDataset = Datasource().loadAffirmations()
        val recyclerView = binding.recyclerView

// Initialize adapter.
        recyclerView.adapter = ItemAdapter(this, myDataset)

    }
}
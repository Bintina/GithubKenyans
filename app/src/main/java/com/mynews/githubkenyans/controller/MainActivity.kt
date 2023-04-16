package com.mynews.githubkenyans.controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.mynews.githubkenyans.R
import com.mynews.githubkenyans.adapter.ItemAdapter
import com.mynews.githubkenyans.data.NrbJavaDevelopersDatasource
import com.mynews.githubkenyans.databinding.ActivityMainBinding
import javax.sql.DataSource

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val myDataset = NrbJavaDevelopersDatasource().loadNrbJavaDevelopers()
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this,myDataset)

    }
}
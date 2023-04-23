package com.mynews.githubkenyans.controller

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mynews.githubkenyans.adapter.ItemAdapter
import com.mynews.githubkenyans.api.DeveloperApiInterface
import com.mynews.githubkenyans.data.Datasource
import com.mynews.githubkenyans.databinding.ActivityMainBinding
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initializeList()

        Datasource.loadNrbJavaDevelopers(adapter)
    }

    private fun initializeList() {
        adapter = ItemAdapter(this)
        val recyclerView = binding.recyclerView
        recyclerView.adapter = adapter
    }
}


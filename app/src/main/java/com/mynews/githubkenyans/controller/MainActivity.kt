package com.mynews.githubkenyans.controller

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.mynews.githubkenyans.adapter.ItemAdapter
import com.mynews.githubkenyans.data.NrbJavaDataSource
import com.mynews.githubkenyans.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    lateinit var adapter: ItemAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeList()

        NrbJavaDataSource.loadNrbJavaDevelopers(adapter)
    }

    private fun initializeList() {
        adapter = ItemAdapter(this)
        val recyclerView = binding.recyclerView
        recyclerView.adapter = adapter
    }


}

/*
private operator fun <T> Response<T>.get(i: Int): Item? {

}
*/

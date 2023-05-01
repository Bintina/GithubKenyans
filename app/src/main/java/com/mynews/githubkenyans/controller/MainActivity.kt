package com.mynews.githubkenyans.controller

import android.content.Intent
import android.os.Bundle
import android.text.util.Linkify
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.mynews.githubkenyans.R
import com.mynews.githubkenyans.adapter.DeveloperAdapter
import com.mynews.githubkenyans.adapter.OnDeveloperClickListener
import com.mynews.githubkenyans.data.NrbJavaDataSource
import com.mynews.githubkenyans.databinding.ActivityMainBinding
import com.mynews.githubkenyans.model.NrbJavaDeveloper

class MainActivity : AppCompatActivity(), OnDeveloperClickListener {

    lateinit var binding: ActivityMainBinding


    lateinit var adapter: DeveloperAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initializeList()

        NrbJavaDataSource.loadNrbJavaDevelopers(adapter)

    }

    private fun initializeList() {
        adapter = DeveloperAdapter(this)
        adapter.listener = this
        val recyclerView = binding.recyclerView
        recyclerView.adapter = adapter

    }

    override fun openDetails(developer: NrbJavaDeveloper) {
        startActivity(Intent(this, NrbJavaDetailsActivity::class.java))
    }


    override fun openLink(link: String) {
        val linkTextView = findViewById<TextView>(R.id.tv_link)
        Linkify.addLinks(linkTextView, Linkify.WEB_URLS)
        Toast.makeText(this, link, Toast.LENGTH_SHORT).show()
    }



}

/*
private operator fun <T> Response<T>.get(i: Int): Item? {

}
*/

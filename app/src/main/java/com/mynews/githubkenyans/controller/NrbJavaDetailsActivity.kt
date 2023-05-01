package com.mynews.githubkenyans.controller

import android.os.Bundle
import android.text.util.Linkify
import androidx.appcompat.app.AppCompatActivity
import com.mynews.githubkenyans.R
import com.mynews.githubkenyans.databinding.ActivityNrbJavaDetailsBinding
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import com.squareup.picasso.Picasso


class NrbJavaDetailsActivity : AppCompatActivity() {

    lateinit var binding: ActivityNrbJavaDetailsBinding

    lateinit var developer: NrbJavaDeveloper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityNrbJavaDetailsBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val avatarUrl = developer.avatar_url
        val username = developer.userName
        val link = developer.html_url

        //Image
        Picasso.with(this)
            .load(avatarUrl)
            .placeholder(R.drawable.ic_baseline_emoji_emotions_24)
            .into(binding.userImageHeader)


        //Username
        binding.username.text = username

        //Github link
        binding.githublink.text = link
        Linkify.addLinks(binding.githublink, Linkify.WEB_URLS)
    }

}
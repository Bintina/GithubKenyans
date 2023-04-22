package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object NrbJavaClientInstance {
    private val retrofit: NrbJavaDeveloperService by lazy {

        Retrofit.Builder()
            .baseUrl(Constants.BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(NrbJavaDeveloperService::class.java)
    }

}


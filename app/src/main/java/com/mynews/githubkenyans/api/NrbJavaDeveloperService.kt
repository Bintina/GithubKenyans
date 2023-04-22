package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.model.Item
import com.mynews.githubkenyans.util.Constants
import retrofit2.Call
import retrofit2.http.GET

interface NrbJavaDeveloperService {
    @GET(Constants.NRB_JAVA_END_URL)
    fun getItems(): retrofit2.Call<List<Item>>
}
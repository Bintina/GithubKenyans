package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.model.NrbJavaDeveloper
import com.mynews.githubkenyans.util.Constants
import retrofit2.http.GET

interface NrbJavaDeveloperService {
    @GET(Constants.NRB_JAVA_END_URL)
    fun getDevelopers(): retrofit2.Call<List<NrbJavaDeveloper>>
}
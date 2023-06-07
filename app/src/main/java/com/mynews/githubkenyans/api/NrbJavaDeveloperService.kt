package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.model.NrbJavaDeveloper
import com.mynews.githubkenyans.model.NrbJavaDevelopers
import com.mynews.githubkenyans.util.Constants
import retrofit2.Response
import retrofit2.http.GET

interface NrbJavaDeveloperService {
    @GET(Constants.NRB_JAVA_END_URL)
    fun getDevelopers(): NrbJavaDevelopers
}
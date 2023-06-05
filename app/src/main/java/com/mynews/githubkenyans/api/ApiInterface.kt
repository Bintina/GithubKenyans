package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.model.NrbJavaDevelopers
import com.mynews.githubkenyans.util.Constants
import com.mynews.githubkenyans.util.Constants.BASE_URL
import retrofit2.Call
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET


    interface ApiInterface {
        @GET(Constants.NRB_JAVA_END_URL)
         suspend fun getDevelopers() : Response<NrbJavaDevelopers>


    }

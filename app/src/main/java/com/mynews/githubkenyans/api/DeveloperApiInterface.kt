package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.model.NrbJavaDevelopers
import com.mynews.githubkenyans.util.Constants
import com.mynews.githubkenyans.util.Constants.BASE_URL
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface DeveloperApiInterface {
    interface ApiInterface {
        @GET(Constants.NRB_JAVA_END_URL)
        fun getDevelopers() : Call<NrbJavaDevelopers>

        companion object {

            fun create() : ApiInterface {

                val retrofit = Retrofit.Builder()
                    .addConverterFactory(GsonConverterFactory.create())
                    .baseUrl(BASE_URL)
                    .build()
                return retrofit.create(ApiInterface::class.java)

            }
        }
    }
}
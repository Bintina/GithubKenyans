package com.mynews.githubkenyans.api

import com.mynews.githubkenyans.util.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RetrofitHelper {
    suspend fun create() : ApiInterface {

        val retrofit = Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .baseUrl(Constants.BASE_URL)
            .build()
        return retrofit.create(ApiInterface::class.java)

    }

}
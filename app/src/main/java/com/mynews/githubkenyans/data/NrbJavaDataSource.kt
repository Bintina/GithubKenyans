package com.mynews.githubkenyans.data

import android.util.Log
import com.mynews.githubkenyans.adapter.DeveloperAdapter
import com.mynews.githubkenyans.api.DeveloperApiInterface
import com.mynews.githubkenyans.model.NrbJavaDevelopers
import retrofit2.Call
import retrofit2.Response

object NrbJavaDataSource {
    fun loadNrbJavaDevelopers(adapter: DeveloperAdapter) {
        val apiCall = DeveloperApiInterface.ApiInterface.create().getDevelopers()
        apiCall.enqueue(object : retrofit2.Callback<NrbJavaDevelopers?> {
            override fun onResponse(
                call: Call<NrbJavaDevelopers?>,
                response: Response<NrbJavaDevelopers?>
            ) {
                val responseBody = response.body()!!
                with(adapter) {
                    listNrbJavaDeveloper = responseBody.items
                    notifyDataSetChanged()
                }
            }


            override fun onFailure(call: Call<NrbJavaDevelopers?>, t: Throwable) {
                Log.e("Failure Log", "OnFailure" + t.message)
            }
        })
    }
}
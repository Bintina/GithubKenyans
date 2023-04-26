package com.mynews.githubkenyans.data

import android.util.Log
import com.mynews.githubkenyans.adapter.ItemAdapter
import com.mynews.githubkenyans.api.DeveloperApiInterface
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

object NrbJavaDataSource {
    fun loadNrbJavaDevelopers(adapter: ItemAdapter){
        val apiCall = DeveloperApiInterface.ApiInterface.create().getItems()
        apiCall.enqueue(object :  retrofit2.Callback<NrbJavaDeveloper?> {
override fun onResponse(call: Call<NrbJavaDeveloper?>,response: Response<NrbJavaDeveloper?>){
    val responseBody = response.body()!!
    with(adapter){
        items = responseBody.items
        notifyDataSetChanged()
    }
}


            override fun onFailure(call: Call<NrbJavaDeveloper?>, t: Throwable) {
                Log.e("Failure Log", "OnFailure" + t.message)
            }
        })
    }
}
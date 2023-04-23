package com.mynews.githubkenyans.data

import android.util.Log
import com.mynews.githubkenyans.adapter.ItemAdapter
import com.mynews.githubkenyans.api.DeveloperApiInterface
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

object Datasource {

    fun loadNrbJavaDevelopers(adapter: ItemAdapter) {
        val apiCall = DeveloperApiInterface.ApiInterface.create().getItems()
        apiCall.enqueue(object : Callback<NrbJavaDeveloper?> {
            override fun onResponse(
                call: Call<NrbJavaDeveloper?>,
                response: Response<NrbJavaDeveloper?>
            ) {
                val responseBody = response.body()!!
                adapter.items = responseBody.items

                // not the best approach but for now this will get the job done
                adapter.notifyDataSetChanged()

                /*You could also do the following

                * with(adapter) {
                    items = responseBody.items
                    notifyDataSetChanged()
                }
                * */

            }

            override fun onFailure(call: Call<NrbJavaDeveloper?>, t: Throwable) {
                Log.e("Failure Log", "onFailure:" + t.message)
            }
        })

    }
}
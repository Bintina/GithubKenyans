package com.mynews.githubkenyans.data

import android.util.Log
import com.mynews.githubkenyans.api.DeveloperApiInterface
import com.mynews.githubkenyans.model.Item
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import com.mynews.githubkenyans.util.Constants.myDataset
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class NrbJavaDevelopersDatasource {


    fun loadNrbJavaDevelopers(): NrbJavaDeveloper {
        val apiCall = DeveloperApiInterface.ApiInterface.create().getItems()
        apiCall.enqueue(object : Callback<NrbJavaDeveloper?> {
            override fun onResponse(
                call: Call<NrbJavaDeveloper?>,
                response: Response<NrbJavaDeveloper?>
            ) {
                val responseBody = response.body()!!
                Log.d(
                    "Datasource Response Log",
                    "Response Body: $responseBody"
                )
                myDataset = response.body()!!

            }

            override fun onFailure(call: Call<NrbJavaDeveloper?>, t: Throwable) {
                Log.d("Failure Log", "onFailure:" + t.message)
            }


        })

        return myDataset
    }
}
/* //Sample data
 Item(
     R.string.sampleLogin,
     R.string.sampFollowers,
     R.string.sampleUserLink
 ),

 Item(
     R.string.vS1_user,
     R.string.vS1_followers,
     R.string.vS1_link
 ),

 Item(
     R.string.vS2_user,
     R.string.vS2_followers,
     R.string.vS2_link
 ),*/

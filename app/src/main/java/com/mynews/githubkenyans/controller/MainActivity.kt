package com.mynews.githubkenyans.controller

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.mynews.githubkenyans.adapter.ItemAdapter
import com.mynews.githubkenyans.api.DeveloperApiInterface
import com.mynews.githubkenyans.data.NrbJavaDevelopersDatasource
import com.mynews.githubkenyans.databinding.ActivityMainBinding
import com.mynews.githubkenyans.model.Item
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import com.mynews.githubkenyans.util.Constants.myDataset
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding


    lateinit var item: Item

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        myDataset = NrbJavaDevelopersDatasource().loadNrbJavaDevelopers()

        val apiCall = DeveloperApiInterface.ApiInterface.create().getItems()
        apiCall.enqueue(object : Callback<NrbJavaDeveloper?> {
            override fun onResponse(
                call: Call<NrbJavaDeveloper?>,
                response: Response<NrbJavaDeveloper?>
            ) {
                val responseBody = response.body()!!
                Log.d(
                    "Response Log",
                    "Response Body: $responseBody"
                )
                myDataset = response.body()!!
                initViews()
            }

            override fun onFailure(call: Call<NrbJavaDeveloper?>, t: Throwable) {
                Log.d("Failure Log", "onFailure:" + t.message)
            }


        })

        initViews()

    }


    private fun initViews() {
        val recyclerView = binding.recyclerView
        recyclerView.adapter = ItemAdapter(this, myDataset)

    }
}

/*
private operator fun <T> Response<T>.get(i: Int): Item? {

}
*/

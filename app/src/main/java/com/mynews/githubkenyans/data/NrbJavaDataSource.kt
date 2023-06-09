package com.mynews.githubkenyans.data

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import com.mynews.githubkenyans.adapter.DeveloperAdapter
import com.mynews.githubkenyans.api.RetrofitHelper
import com.mynews.githubkenyans.controller.MainActivity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

object NrbJavaDataSource {
    fun loadNrbJavaDevelopers(activity: AppCompatActivity, adapter: DeveloperAdapter) {

        val apiCall = RetrofitHelper.create()

        activity.lifecycleScope.launch(Dispatchers.IO) {
            val response = try {
                apiCall.getDevelopers()
            } catch (e: Exception) {
                Log.e("NrbJavaDataSource", e.message.toString())
                null
            }

            response?.let {
                withContext(Dispatchers.Main) {
                    adapter.listNrbJavaDeveloper = it.items
                    adapter.notifyDataSetChanged()
                }
            }
        }
    }
}
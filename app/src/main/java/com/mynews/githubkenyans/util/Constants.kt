package com.mynews.githubkenyans.util

import com.mynews.githubkenyans.model.NrbJavaDeveloper

object Constants {
    const val BASE_URL ="https://api.github.com"
    const val NRB_JAVA_END_URL ="/search/users?q=language:java+location:nairobi"
    lateinit var myDataset: NrbJavaDeveloper
}
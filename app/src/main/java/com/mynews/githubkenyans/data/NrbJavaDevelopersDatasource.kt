package com.mynews.githubkenyans.data

import com.mynews.githubkenyans.R
import com.mynews.githubkenyans.model.Item

class NrbJavaDevelopersDatasource {
    fun loadNrbJavaDevelopers(): List<Item> {
        return listOf<Item>(
            //Sample data
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
            ),
        )
    }
}
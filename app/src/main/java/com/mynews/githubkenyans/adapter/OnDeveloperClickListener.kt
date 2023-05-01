package com.mynews.githubkenyans.adapter

import com.mynews.githubkenyans.model.NrbJavaDeveloper

interface OnDeveloperClickListener {

    fun openDetails(developer: NrbJavaDeveloper)

    fun openLink(link: String)

}
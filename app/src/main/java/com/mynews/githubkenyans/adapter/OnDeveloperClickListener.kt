package com.mynews.githubkenyans.adapter

import com.mynews.githubkenyans.model.NrbJavaDeveloper

interface OnDeveloperClickListener {

    fun openDetails(clickedDeveloper: NrbJavaDeveloper)

    fun openLink(link: String)

}
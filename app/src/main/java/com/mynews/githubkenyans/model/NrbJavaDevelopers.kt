package com.mynews.githubkenyans.model

data class NrbJavaDevelopers(
    val incomplete_results: Boolean,
    var items: List<NrbJavaDeveloper>,
    val total_count: Int
)
package com.mynews.githubkenyans.model

data class NrbJavaDeveloper(
    val incomplete_results: Boolean,
    var items: List<Item>,
    val total_count: Int
)
package com.mynews.githubkenyans.model

data class NrbJavaDeveloper(
    val incomplete_results: Boolean,
    val items: List<Item>,
    val total_count: Int
)
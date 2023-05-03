package com.mynews.githubkenyans.model

import android.os.Parcel
import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

@Parcelize
data class NrbJavaDeveloper(
    val avatar_url: String,
    @SerializedName("login")
    val userName: String,
    val followers_url: String,
    val html_url: String
):Parcelable{
    /*
    val events_url: String,
    val following_url: String,
    val gists_url: String,
    val gravatar_id: String,
    val id: Int,
    val node_id: String,
    val organizations_url: String,
    val received_events_url: String,
    val repos_url: String,
    val score: Double,
    val site_admin: Boolean,
    val starred_url: String,
    val subscriptions_url: String,
    val type: String,
    val url: String*/
}

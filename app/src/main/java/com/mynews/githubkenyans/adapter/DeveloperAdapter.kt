package com.mynews.githubkenyans.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import com.mynews.githubkenyans.R
import com.mynews.githubkenyans.model.NrbJavaDeveloper
import com.squareup.picasso.Picasso

class DeveloperAdapter(private val context: Context) :
    RecyclerView.Adapter<DeveloperAdapter.ItemViewHolder>() {


    var listNrbJavaDeveloper: List<NrbJavaDeveloper> = mutableListOf<NrbJavaDeveloper>()
    lateinit var listener: OnDeveloperClickListener

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val container: CardView = view.findViewById(R.id.linear_card_contents)

        val avatarView: ImageView = view.findViewById(R.id.tv_avatar)
        val userView: TextView = view.findViewById(R.id.tv_username)
        val followersView: TextView = view.findViewById(R.id.tv_followers)
        val linkView: TextView = view.findViewById(R.id.tv_link)

        //on item click

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_row, parent, false)
        return ItemViewHolder(adapterLayout)


    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val developerInPosition = listNrbJavaDeveloper[position]
        val developerAvatarUrl = developerInPosition.avatar_url

        //Card container holder
        holder.container.setOnClickListener{listener.openDetails(developerInPosition)}
        //holder.userView.setOnClickListener{listener.openLink(item.userName)}

        //Image holder
        Picasso.with(context)
            .load(developerAvatarUrl)
            .placeholder(R.drawable.ic_baseline_emoji_emotions_24)
            .into(holder.avatarView)

        //User holder
        holder.userView.text = developerInPosition.userName

        //Followers holder
        holder.followersView.text = developerInPosition.followers_url

        //Followers holder
        holder.linkView.text = developerInPosition.html_url
    }

    override fun getItemCount() = listNrbJavaDeveloper.size
}
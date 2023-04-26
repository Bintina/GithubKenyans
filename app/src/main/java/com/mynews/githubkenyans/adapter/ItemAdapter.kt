package com.mynews.githubkenyans.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mynews.githubkenyans.R
import com.mynews.githubkenyans.model.Item
import com.mynews.githubkenyans.model.NrbJavaDeveloper

class ItemAdapter(private val context: Context) :
    RecyclerView.Adapter<ItemAdapter.ItemViewHolder>() {

   var items: List<Item> = mutableListOf<Item>()

    class ItemViewHolder(private val view: View) : RecyclerView.ViewHolder(view) {
        val userView: TextView = view.findViewById(R.id.tv_username)
        val followersView: TextView = view.findViewById(R.id.tv_followers)
        val linkView: TextView = view.findViewById(R.id.tv_link)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.developer_row, parent, false)
        return ItemViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: ItemViewHolder, position: Int) {
        val item = items[position]

        holder.userView.text = item.login
        holder.followersView.text = item.followers_url
        holder.linkView.text = item.html_url
    }

    override fun getItemCount() = items.size
}
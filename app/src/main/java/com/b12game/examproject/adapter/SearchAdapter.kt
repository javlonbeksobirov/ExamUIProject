package com.b12game.examproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.b12game.examproject.R
import com.b12game.examproject.fragments.MessagePageFragment
import com.b12game.examproject.fragments.SearchPageFragment
import com.b12game.examproject.model.ContactModel
import com.b12game.examproject.model.SearchModel
import com.google.android.material.imageview.ShapeableImageView

class SearchAdapter(var context: SearchPageFragment, var items: ArrayList<SearchModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_search, parent, false)
        return SearchViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is SearchViewHolder) {
            var profile = holder.profile
            var fullname = holder.fullname
            var description = holder.description
            var message = holder.message

            profile.setImageResource(item.profile)
            message.text = item.messaga
            description.text = item.desc
            fullname.text = item.fullname
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class SearchViewHolder(view: View):RecyclerView.ViewHolder(view){
        var profile: ShapeableImageView
        var fullname: TextView
        var description: TextView
        var message : TextView

        init {
            profile = view.findViewById(R.id.iv_profile)
            fullname = view.findViewById(R.id.fullname)
            description = view.findViewById(R.id.tv_description)
            message = view.findViewById(R.id.tv_message)
        }
    }

}
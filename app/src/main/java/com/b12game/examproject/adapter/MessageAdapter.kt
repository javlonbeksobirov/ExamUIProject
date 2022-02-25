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
import com.b12game.examproject.model.ContactModel
import com.google.android.material.imageview.ShapeableImageView

class MessageAdapter(var context: MessagePageFragment, var items: ArrayList<ContactModel>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_contact_message, parent, false)
        return MessageViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is MessageViewHolder) {
            var profile = holder.profile
            var fullname = holder.fullname
            var message = holder.message

            profile.setImageResource(item.profileImage)
            fullname.text = item.fullname
            message.text = item.message
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class MessageViewHolder(view: View):RecyclerView.ViewHolder(view){
        var profile: ShapeableImageView
        var fullname: TextView
        var message: TextView

        init {
            profile = view.findViewById(R.id.iv_profile)
            fullname = view.findViewById(R.id.fullname)
            message = view.findViewById(R.id.message)
        }
    }

}
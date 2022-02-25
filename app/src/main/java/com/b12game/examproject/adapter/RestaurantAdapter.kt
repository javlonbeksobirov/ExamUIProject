package com.b12game.examproject.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.b12game.examproject.R
import com.b12game.examproject.fragments.HomePageFragment
import com.b12game.examproject.model.RestaurantModel
import com.example.examnasriddinovislom.adapter.CategoryAdapter

class RestaurantAdapter(var context: HomePageFragment, var items: ArrayList<RestaurantModel>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.restaurant_item, parent, false)
        return RestaurantViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is RestaurantViewHolder) {
            var photo = holder.photo
            var text = holder.name
            var desc = holder.desr

            photo.setImageResource(item.image)
            text.text = item.title
        }
    }

    override fun getItemCount(): Int {
       return items.size
    }

    class RestaurantViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var photo: ImageView
        var name: TextView
        var desr: TextView

        init {
            photo = view.findViewById(R.id.restaurant_item_image)
            name = view.findViewById(R.id.restaurant_item_title)
            desr = view.findViewById(R.id.tv_restaraunt_item_description)
        }
    }
}
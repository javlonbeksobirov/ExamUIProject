package com.example.examnasriddinovislom.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.b12game.examproject.R
import com.b12game.examproject.fragments.HomePageFragment
import com.b12game.examproject.model.CategoryModel

class CategoryAdapter(var context: HomePageFragment, var items: ArrayList<CategoryModel>) :
    RecyclerView.Adapter<RecyclerView.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.categories_item, parent, false)
        return CategoryViewHolder(view)
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val item = items[position]

        if (holder is CategoryViewHolder) {
            var photo = holder.photo
            var text = holder.name

            photo.setImageResource(item.photo)
            text.text = item.text
        }

    }

    override fun getItemCount(): Int {
        return items.size
    }

    class CategoryViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        var photo: ImageView
        var name: TextView

        init {
            photo = view.findViewById(R.id.iv_categories_image)
            name = view.findViewById(R.id.tv_categories_title)
        }
    }
}
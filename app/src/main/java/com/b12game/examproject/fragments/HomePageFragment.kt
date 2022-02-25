package com.b12game.examproject.fragments


import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.b12game.examproject.R
import com.b12game.examproject.adapter.RestaurantAdapter
import com.b12game.examproject.model.CategoryModel
import com.b12game.examproject.model.RestaurantModel
import com.example.examnasriddinovislom.adapter.CategoryAdapter


class HomePageFragment : Fragment() {

    lateinit var categoryRecycler: RecyclerView
    lateinit var restaurantRecyclerView: RecyclerView

    private fun getAllCategories(): ArrayList<CategoryModel> {

        val category: ArrayList<CategoryModel> = ArrayList<CategoryModel>()

        category.add(CategoryModel("hello",R.drawable.im_10))
        category.add(CategoryModel("salom",R.drawable.im_10))
        category.add(CategoryModel("nimadir",R.drawable.im_10))
        category.add(CategoryModel("Bye Bye",R.drawable.im_10))
        category.add(CategoryModel("welcome",R.drawable.im_10))
        return category

    }

    private fun getAllRestaurants(): ArrayList<RestaurantModel> {

        val restaurant: ArrayList<RestaurantModel> = ArrayList<RestaurantModel>()

        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))
        restaurant.add(RestaurantModel("salom","The best programming",R.drawable.im_10))

        return restaurant

    }

    fun refreshRestaurantAdpter(restaurant: ArrayList<RestaurantModel>){
        val adapter = RestaurantAdapter(this, restaurant)
        restaurantRecyclerView!!.adapter = adapter
    }

    private fun refreshAdadpter(category: ArrayList<CategoryModel>) {
        val adapter = CategoryAdapter(this, category)
        categoryRecycler!!.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var view: View = inflater.inflate(R.layout.homefragment, container, false)

        categoryRecycler = view.findViewById(R.id.recyclerViewCategories)
        categoryRecycler.setLayoutManager(LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL, false))
        refreshAdadpter(getAllCategories())

        restaurantRecyclerView = view.findViewById(R.id.recyclerViewRestaurant)
        restaurantRecyclerView.setLayoutManager(GridLayoutManager(context,2))
        refreshRestaurantAdpter(getAllRestaurants())

        return view
    }
}
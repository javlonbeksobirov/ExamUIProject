package com.b12game.examproject.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.b12game.examproject.R
import com.b12game.examproject.adapter.MessageAdapter
import com.b12game.examproject.adapter.SearchAdapter
import com.b12game.examproject.model.ContactModel
import com.b12game.examproject.model.SearchModel

class SearchPageFragment: Fragment() {

    lateinit var recyclerViewSearch: RecyclerView

    private fun getAllCategories(): ArrayList<SearchModel> {

        val filters: ArrayList<SearchModel> = ArrayList<SearchModel>()
        filters.add(SearchModel(R.drawable.im_10,"lasdjklasdjkladsjklds","Hello","Fullname"))
        filters.add(SearchModel(R.drawable.im_10,"lasdjklasdjkladsjklds","Hello","Fullname"))
        filters.add(SearchModel(R.drawable.im_10,"lasdjklasdjkladsjklds","Hello","Fullname"))
        filters.add(SearchModel(R.drawable.im_10,"lasdjklasdjkladsjklds","Hello","Fullname"))
        filters.add(SearchModel(R.drawable.im_10,"lasdjklasdjkladsjklds","Hello","Fullname"))
        filters.add(SearchModel(R.drawable.im_10,"lasdjklasdjkladsjklds","Hello","Fullname"))

        return filters

    }

    fun refreshAdpter(filter: ArrayList<SearchModel>){
        val adapter = SearchAdapter(this,filter)
        recyclerViewSearch!!.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var view: View = inflater.inflate(R.layout.messagefragment, container, false)

        recyclerViewSearch = view.findViewById(R.id.recyclerView)
        recyclerViewSearch.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false))
        refreshAdpter(getAllCategories())

        return view
    }
}
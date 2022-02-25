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
import com.b12game.examproject.adapter.MessageAdapter
import com.b12game.examproject.adapter.RestaurantAdapter
import com.b12game.examproject.model.CategoryModel
import com.b12game.examproject.model.ContactModel
import com.b12game.examproject.model.RestaurantModel

class MessagePageFragment: Fragment() {

    lateinit var recyclerViewContact: RecyclerView

    private fun getAllCategories(): ArrayList<ContactModel> {

        val contacts: ArrayList<ContactModel> = ArrayList<ContactModel>()

        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))
        contacts.add(ContactModel(R.drawable.im_10,"Javlon","Hello my friend"))

        return contacts

    }

    fun refreshAdpter(contacts: ArrayList<ContactModel>){
        val adapter = MessageAdapter(this,contacts )
        recyclerViewContact!!.adapter = adapter
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        var view: View = inflater.inflate(R.layout.messagefragment, container, false)

        recyclerViewContact = view.findViewById(R.id.recyclerView)
        recyclerViewContact.setLayoutManager(LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false))
        refreshAdpter(getAllCategories())


        return view
    }
}
package com.b12game.examproject.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.b12game.examproject.R
import com.b12game.examproject.fragments.HomePageFragment
import com.b12game.examproject.fragments.MessagePageFragment
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {

    private val homePageFragment = HomePageFragment()
//    private val collectionPageFragment = CollectionPageFragment()
    private val messagePageFragment = MessagePageFragment()
//    private val searchPageFragment = SearchPageFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        initView()

    }

    private fun initView() {
        replaceFragment(homePageFragment)

        var bottom_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)
//
        bottom_navigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.nav_home -> replaceFragment(homePageFragment)
//                R.id.nav_collection -> replaceFragment(collectionPageFragment)
                R.id.nav_message -> replaceFragment(messagePageFragment)
//                R.id.nav_search -> replaceFragment(searchPageFragment)

            }
            true
        }
    }

    private fun replaceFragment(fragment: Fragment){
        if (fragment != null){
            val transaction = supportFragmentManager.beginTransaction()
            transaction.replace(R.id.fragment_container, fragment)
            transaction.commit()
        }
    }
}
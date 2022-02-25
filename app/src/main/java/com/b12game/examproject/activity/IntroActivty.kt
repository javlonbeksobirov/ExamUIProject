package com.b12game.examproject.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.viewpager2.widget.ViewPager2
import com.b12game.examproject.R
import com.b12game.examproject.SharedPref
import com.b12game.examproject.adapter.ViewPagerAdapter
import com.b12game.examproject.model.IntroModel
import me.relex.circleindicator.CircleIndicator3

class IntroActivty : AppCompatActivity() {
    lateinit var viewPager2 : ViewPager2
    lateinit var indicator : CircleIndicator3
    lateinit var btn_done: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intro_activty)
        initViews()
    }

    private fun initViews() {
        indicator = findViewById(R.id.indicator)
        viewPager2 = findViewById(R.id.viewPager2)
        viewPager2.orientation = ViewPager2.ORIENTATION_HORIZONTAL
        refreshAdapter(addProduct())
//        btn_done = findViewById(R.id.btn_done)
//        btn_done.setOnClickListener {
//            SharedPref(this).isSaved = true
//            var intent = Intent(this,MainActivity::class.java)
//            startActivity(intent)
//        }
    }

    private fun refreshAdapter(product: ArrayList<IntroModel>) {
        val adapter =  ViewPagerAdapter(this,product)
        viewPager2.adapter = adapter
        indicator.setViewPager(viewPager2)

    }

    fun addProduct(): ArrayList<IntroModel>{
        val intro : ArrayList<IntroModel> = ArrayList()
        intro.add(IntroModel("Chat", "hello my name is javlonbek",R.drawable.heart))
        intro.add(IntroModel("Chat", "hello my name is javlonbek",R.drawable.ic_outline_photo_camera_24))
        intro.add(IntroModel("Chat", "hello my name is javlonbek",R.drawable.ic_baseline_chat_bubble_outline_24))
        intro.add(IntroModel("Chat", "hello my name is javlonbek",R.drawable.ic_outline_notifications_24))
        return intro
    }
}
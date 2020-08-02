package com.damazo.materialcomponents

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_bottom_navigation.*

class BottomNavigationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_navigation)

        bottomNavigation.selectedItemId = R.id.menu_option_two

        bottomNavigation.setOnNavigationItemSelectedListener {
            when(it.itemId){
                R.id.menu_option_one -> {
                    true
                }
                R.id.menu_option_two -> {
                    true
                }
                R.id.menu_option_three -> {
                    true
                }
                else -> false
            }
        }

        setSupportActionBar(toolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            title = "Bottom navigation"
        }
    }


}
/*
 * BottomAppBarActivity.kt
 * CitiMobileApp Android
 * Created by rodrigo.bautista on 7/29/20 12:27 AM
 * Copyright © 2020 Globant-MX. All rights reserved.
 */

package com.damazo.materialcomponents

import android.content.Intent
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_bottom_bar.*

class BottomAppBarActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bottom_bar)
        setSupportActionBar(bottomAppBar)
        floatingActionButtonAnchored.setOnClickListener {
            startActivity(Intent(this, BottomNavigationActivity::class.java))
        }
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.bottom_app_bar_menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            android.R.id.home -> {
                val bottomNavDrawerFragment = BottomNavigationDrawerFragment()
                bottomNavDrawerFragment.show(supportFragmentManager, bottomNavDrawerFragment.tag)
            }
            R.id.menu_option_one ->
                startActivity(Intent(this, TextFieldsActivity::class.java))
            R.id.menu_option_two ->
                startActivity(Intent(this, ButtonsActivity::class.java))

        }
        return true
    }
}
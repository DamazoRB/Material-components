/*
 * NewActivity.kt
 * CitiMobileApp Android
 * Created by rodrigo.bautista on 7/28/20 12:33 AM
 * Copyright © 2020 Globant-MX. All rights reserved.
 */

package com.damazo.materialcomponents

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_buttons.*

class ButtonsActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_buttons)
        setSupportActionBar(toolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            title = "Bottom navigation"
        }
    }
}
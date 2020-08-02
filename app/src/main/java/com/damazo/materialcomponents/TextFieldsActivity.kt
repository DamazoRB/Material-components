/*
 * TextFieldsActivity.kt
 * CitiMobileApp Android
 * Created by rodrigo.bautista on 7/28/20 1:49 AM
 * Copyright © 2020 Globant-MX. All rights reserved.
 */

package com.damazo.materialcomponents

import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_text_fields.*
import kotlinx.android.synthetic.main.activity_text_fields.toolbar

class TextFieldsActivity:AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text_fields)


        setupFields()
        setSupportActionBar(toolbar)
        supportActionBar?.run {
            setDisplayHomeAsUpEnabled(true)
            title = "Bottom navigation"
        }
    }

    private fun setupFields() {
        val items = listOf("Material", "Design", "Components", "Android", "Globant")
        val adapter = ArrayAdapter(this, R.layout.item_text_field, items)
        (exposedDropdownField.editText as? AutoCompleteTextView)?.setAdapter(adapter)
    }
}
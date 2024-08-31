package com.example.newrigisterform

import android.os.Bundle
import android.provider.ContactsContract.CommonDataKinds.Email
import android.widget.ArrayAdapter
import android.widget.Spinner
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val spinnerId = findViewById<Spinner>(R.id.list_item2)
        val colors = arrayOf("Blue","Green","red","pink","Black","White","Orange")
        val names = arrayOf("vicky","Ravi","Rohit","sharma","Mohit")
        val spinner = findViewById<Spinner>(R.id.list_item)


        val arrf = ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_dropdown_item,names)
        spinner.adapter = arrf


        val arr = ArrayAdapter(this@MainActivity,android.R.layout.simple_spinner_dropdown_item,colors)
        spinnerId.adapter = arr
        }
    }


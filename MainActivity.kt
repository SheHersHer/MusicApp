package com.example.practicum

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.core.view.ViewCompat
import com.example.practicum.R.id
import com.example.practicum.R.id.main

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        //Find the buttons by their ID
        val btnNext: Button = findViewById(id.btnNext)
        val btnExist: Button = findViewById(id.btnExist)

        //Set an OnClickListener for the Next button to navigate to MainScreen
        btnNext.setOnClickListener {
            val intent = Intent(this, MainscreenActivity::class.java)
            startActivity(intent)
        }

        //set an OnClickListener for the Exist button to close the Activity
        btnExist.setOnClickListener {
            finish()
        }
    }
}
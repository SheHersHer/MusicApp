package com.example.practicum

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainscreenActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "WrongViewCast")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.mainscreen)

        val txtDay:EditText = findViewById(R.id.TxtDay)
        val txtMorningSteps:EditText= findViewById(R.id.TxtMorningSteps)
        val txtAfternoonSteps:EditText= findViewById(R.id.TxtAfternoonSteps)
        val txtActivityNotes:EditText= findViewById(R.id.TxtActivityNotes)


            val textViewMessage: TextView = findViewById(R.id.textView5)
            val btnDisplay: Button = findViewById(R.id.btnDisplay)
            val btnClear: Button = findViewById(R.id.btnClear)
            val btnBack: Button = findViewById(R.id.btnBack)

            val validDays = arrayOf(
                "2024-10-07",
                "2024-10-08",
                "2024-10-09",
                "2024-10-10",
                "2024-10-11",
                "2024-10-12",
                "20224-10-13"
            )
            val validMorningSteps = arrayOf("2000", "150", "300", "500", "250", "700", "1500")
            val validAfternoonSteps =
                arrayOf("3000", "4000", "2500", "3500", "3000", "5000", "5500")
            val validActivityNotes = arrayOf(
                "Walked to classes and around campus",
                "Strolled during study breaks",
                "Walked to campus"
            )

            btnDisplay.setOnClickListener {
                val day = txtDay.text.toString()
                val morningsteps = txtMorningSteps.text.toString()
                val afternoonsteps = txtAfternoonSteps.text.toString()
                val activitynotes = txtActivityNotes.text.toString()

            }
            val intent = Intent(this, detailedviewscreen::class.java).apply { putExtra("day", txtDay) putExtra ("afternoonSteps"), afternoonSteps) putExtra("activityNotes", activityNotes)
            }
            startActivity(intent)
        }else{
    {
         //btnClear.setOnClickListener

        TxtDay.text.clear()
        TxtMorningSteps.text.clear()
        TxtActivityNotes.text.clear
    }

  //btnBack.setOnClickListener
   // finish()
   }
  }


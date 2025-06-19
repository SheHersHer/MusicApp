package com.example.practicum

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.ViewCompat

private infix fun String?.activityNotes(stringExtra: String?) {

}

class MainActivity2 : AppCompatActivity() {
    private fun enableEdgeToEdge() {
        TODO("Not yet implemented")
    }

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detailedviewscreen)

        val days = arrayOf(
            "2024-10-07",
            "2024-10-08",
            "2024-10-09",
            "2024-10-10",
            "2024-10-11",
            "2024-10-12",
            "20224-10-13" )
            val MorningSteps = arrayOf("2000", "150" , "300" , "500" , "250" , "700" , "1500")
        val AfternoonSteps =
            arrayOf("3000", "4000", "2500", "3500", "3000", "5000", "5500")
        val validActivityNotes = arrayOf(
            "Walked to classes and around campus",
            "Strolled during study breaks",
            "Walked to campus"
        )
        val txtDetails: TextView= findViewById(R.id.TxtDetails)
        val txtAverage: TextView = findViewById(R.id.TxtAverage)
        val btnBack: Button = findViewById(R.id.btnBack)

         intent.getStringExtra("day")

        intent.getStringExtra("morningSteps")activityNotes

        intent.getStringExtra("afternoonSteps")

        intent.getStringExtra("activityNotes")

        var details= "" +
                for (i in days.indices)"{
        val i = null
        details += "Day:${days[i]}/n"
        val morningSteps = null
        details += "Morning Steps:${morningSteps[i]}/n"
        val i = Unit
        details += "Afternoon Steps:${[i]}/n"
                        details += "Activity Notes:${[i].getOrNull(i)?:"N/A"}/n/n"
                }
    //txtDetails.text = details

    val averageMorning = morningSteps.average()
    val averageAfternoon = afternoonSteps.average()
    txtAverage.text = "Average Morning Steps:${"%.2f".format(averageMorning)}/n"+
    "Average Afternoon Steps:${"%.2f".format(averageAfternoon)}"

    btnBack.setOnClickListener{
        finish()

    }
}



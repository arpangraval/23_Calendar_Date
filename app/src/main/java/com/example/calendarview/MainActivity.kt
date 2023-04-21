package com.example.calendarview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.CalendarView
import android.widget.TextView
import android.widget.Toast
import androidx.core.view.get
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var clv:CalendarView = findViewById(R.id.calendarView)

        clv.setOnDateChangeListener { calendarView, i, i2, i3 ->
        var month = i2+1
           var tm = Calendar.getInstance().time
            var timehour = tm.hours.toString()
            var timemin = tm.minutes.toString()

            Toast.makeText(this, "You have selected: $i3/$month/$i $tm $timehour $timemin", Toast.LENGTH_LONG).show()

            var tvv:TextView = findViewById(R.id.tv)
            tvv.text = i3.toString() +" "+ (i2+1).toString()+ " " + i.toString()
            var tvv2:TextView = findViewById(R.id.tv2)
            tvv2.text = tm.hours.toString()

        }
        
    

    }
}
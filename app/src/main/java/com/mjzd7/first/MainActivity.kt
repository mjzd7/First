package com.mjzd7.first

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_On = findViewById<Button>(R.id.on_button)

        var timesClicked = 0
        btn_On.setOnClickListener{
            btn_On.text = "You clicked me again"
            val greeting = findViewById<TextView>(R.id.greeting)
            timesClicked += 1
            greeting.text = "Total number of people counted are : "+timesClicked.toString();
            Toast.makeText(this, "Hey you clicked the Button", Toast.LENGTH_SHORT).show()
        }
    }
}
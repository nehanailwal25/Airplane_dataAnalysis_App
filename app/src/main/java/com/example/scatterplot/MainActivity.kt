package com.example.scatterplot

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val start = findViewById<Button>(R.id.start)
        start.setOnClickListener{
//            var intent = Intent(this, scatter_chart::class.java)
//            startActivity(intent)

            var intent = Intent(this, ScatterPlotCreation::class.java)
            startActivity(intent)
        }
    }
}
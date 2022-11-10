package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class TextActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_text)

        val btnCount = findViewById<Button>(R.id.btnCount)
        val tvMsg = findViewById<TextView>(R.id.textView)
        var count = 0

        btnCount.setOnClickListener{
            count++
            var msg = "The button was clicked $count"
            msg += if(count < 2) " time." else " times."
            tvMsg.text = msg
        }
    }
}
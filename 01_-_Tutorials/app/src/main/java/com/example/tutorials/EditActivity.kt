package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class EditActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_edit)
        val btnAdd = findViewById<Button>(R.id.btnAdd)
        val num1 = findViewById<EditText>(R.id.etFirstNumber)
        val num2 = findViewById<EditText>(R.id.etSecondNumber)
        val tvResult = findViewById<TextView>(R.id.tvResult)

        btnAdd.setOnClickListener{
            var result = num1.text.toString().toInt()
            result += num2.text.toString().toInt()

            tvResult.text = result.toString()
        }
    }
}
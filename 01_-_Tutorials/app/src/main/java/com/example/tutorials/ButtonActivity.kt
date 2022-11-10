package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText

class ButtonActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_button)

        val btnApply = findViewById<Button>(R.id.btnApply)
        val name = findViewById<EditText>(R.id.etName)
        val lastName = findViewById<EditText>(R.id.etLastName)
        val country = findViewById<EditText>(R.id.etCountry)
        val birthDate = findViewById<EditText>(R.id.etBirthday)

        btnApply.setOnClickListener{
            val logMsg = "${name.text.toString()} ${lastName.text.toString()}, " +
                         "born on ${birthDate.text.toString()} " +
                         "${country.text.toString()} submitted data."
            Log.d("MainActivity", logMsg)
        }
    }
}
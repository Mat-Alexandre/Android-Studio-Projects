package com.example.firstapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Internal variables
        var enableNextPage: Boolean = false

        // Gathering the elements and storing them in variables
        val userInput = findViewById<EditText>(R.id.etUserInput)
        val mainMessage = findViewById<TextView>(R.id.tvMainMsg)
        val buttonApply = findViewById<Button>(R.id.btnApply)
        val buttonNext = findViewById<Button>(R.id.btnNext)

        // Setting up the initial app message
        mainMessage.text = getString(R.string.welcome_msg, "User")

        // Adding a submit button logic with error message
        buttonApply.setOnClickListener {
            if(userInput.text.isNotBlank()) {
                mainMessage.text = getString(R.string.welcome_msg, "${userInput.text}")
                buttonNext.isEnabled = true
            }
            else {
                mainMessage.text = getString(R.string.welcome_msg, "User")
                userInput.error = getString(R.string.error_msg)
                enableNextPage = false
            }
        }

        buttonNext.setOnClickListener {
            // Enable the next screen
            var intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
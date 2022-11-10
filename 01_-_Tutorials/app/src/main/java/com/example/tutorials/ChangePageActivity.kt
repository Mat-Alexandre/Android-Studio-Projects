package com.example.tutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ChangePageActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_change_page)

        val btnChangePage = findViewById<Button>(R.id.btnChangeActivity)

        btnChangePage.setOnClickListener {
            Intent(this, SecondActivity::class.java).also {
                startActivity(it)
            }
        }
    }
}
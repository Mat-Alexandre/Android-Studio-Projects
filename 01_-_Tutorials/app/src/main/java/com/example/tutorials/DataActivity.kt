package com.example.tutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class DataActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data)

        val btnApply = findViewById<Button>(R.id.btnApply2)

        btnApply.setOnClickListener {
            val person = Person(
                (findViewById<EditText>(R.id.etName2)).text.toString(),
                (findViewById<EditText>(R.id.etCountry2)).text.toString(),
                (findViewById<EditText>(R.id.etBirthday2)).text.toString()
            )

            Intent(this, ResultActivity::class.java).also {
                it.putExtra("EXTRA_PERSON", person)
                startActivity(it)
            }
        }
    }
}
package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val person: Person = intent.getSerializableExtra("EXTRA_PERSON") as Person

        val result = "The user data is:\n" +
                "Name: ${person.name}\n" +
                "Country: ${person.country}\n" +
                "Birth Date: ${person.birthDate}"

        (findViewById<TextView>(R.id.tvPerson)).text = result
    }
}
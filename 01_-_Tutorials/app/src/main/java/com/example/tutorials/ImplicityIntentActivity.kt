package com.example.tutorials

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import androidx.activity.result.contract.ActivityResultContracts

class ImplicitIntentActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_implicit_intent)

        val btnTakePhoto = findViewById<Button>(R.id.btnTakePhoto)
        val getContent = registerForActivityResult(ActivityResultContracts.GetContent()) {
            // Handle the returned URI
            val ivPhoto = findViewById<ImageView>(R.id.ivPhoto)
            ivPhoto.setImageURI(it)
        }

        btnTakePhoto.setOnClickListener {
            getContent.launch("image/*")
        }
    }
}
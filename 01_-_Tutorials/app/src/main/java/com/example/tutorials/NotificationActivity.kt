package com.example.tutorials

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import com.google.android.material.snackbar.Snackbar

class NotificationActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notification)

        val btnShowNotification = findViewById<Button>(R.id.btnShowNotification)

        btnShowNotification.setOnClickListener {
            val exampleSnackbar = Snackbar.make(
                findViewById(R.id.clCoordinatorLayout),
                "Hello There!",
                Snackbar.LENGTH_LONG
            )
            exampleSnackbar.setBackgroundTint(R.color.purple_200)
            exampleSnackbar.setAction("Action", NotificationActionListener())
            exampleSnackbar.show()
        }
    }

    internal class NotificationActionListener : View.OnClickListener {
        override fun onClick(p0: View?) {
            Log.d("NotificationActivity", "Button Working")
        }

    }
}
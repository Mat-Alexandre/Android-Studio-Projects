package com.example.tutorials

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.TextView

class CheckRadioActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_check_radio)

        val btnOrder = findViewById<Button>(R.id.btnOrder)
        val rgMeat = findViewById<RadioGroup>(R.id.rgMeat)
        val cbOnions = findViewById<CheckBox>(R.id.cbOnions)
        val cbCheese = findViewById<CheckBox>(R.id.cbCheese)
        val cbSalad = findViewById<CheckBox>(R.id.cbSalad)
        val tvOrder = findViewById<TextView>(R.id.tvOrder)

        btnOrder.setOnClickListener {
            val checkedMeatRadioButtonId = rgMeat.checkedRadioButtonId
            val meat = findViewById<RadioButton>(checkedMeatRadioButtonId)

            val onionsCheck = cbOnions.isChecked
            val cheeseCheck = cbCheese.isChecked
            val saladCheck = cbSalad.isChecked

            tvOrder.text = "You ordered a burger with:\n" +
                    "${meat.text}" +
                    (if(onionsCheck) "\nOnions" else "") +
                    (if(cheeseCheck) "\nCheese" else "") +
                    (if(saladCheck) "\nSalad" else "")
        }
    }
}
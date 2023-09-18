package com.example.toasthandler

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val text = "Кнопка ОК!"
        val duration = Toast.LENGTH_SHORT
        val button: Button = findViewById(R.id.button_ok)
        button.setOnClickListener{
            Toast.makeText(applicationContext, text, duration).show()
        }
    }
}
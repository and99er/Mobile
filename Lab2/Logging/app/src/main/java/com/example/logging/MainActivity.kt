package com.example.logging

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_log: Button = findViewById(R.id.button_log)
        val button_timber: Button = findViewById(R.id.button_timber)
        val text:EditText = findViewById(R.id.Edit_text)

        button_log.setOnClickListener {
            Log.v("From EditText",text.text.toString())
        }
        button_timber.setOnClickListener {
            if (BuildConfig.DEBUG) {
                Timber.plant(Timber.DebugTree())
                Timber.v(text.text.toString())
            }
        }
    }
}
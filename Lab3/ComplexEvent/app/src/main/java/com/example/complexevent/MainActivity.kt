package com.example.complexevent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.ProgressBar
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt: EditText = findViewById(R.id.editTextTextPersonName2)
        val check: CheckBox = findViewById(R.id.checkBox2)
        val save: Button = findViewById(R.id.button)
        val txt_view: TextView = findViewById(R.id.textView)
        val progressBaR:ProgressBar = findViewById(R.id.progressBar)
        var progressStatus: Int = 0
        save.setOnClickListener {
            if(check.isChecked){
                txt_view.text = txt.text.toString()
                progressStatus += 10
                progressBaR.setProgress(progressStatus)
            }
        }
    }
}
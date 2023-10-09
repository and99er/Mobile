package com.example.nestedlayouts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val Rolling: Button = findViewById(R.id.Roll_id)
        val text1: TextView = findViewById(R.id.textView)
        val text2: TextView = findViewById(R.id.textView2)
        val text3: TextView = findViewById(R.id.textView3)
        val text4: TextView = findViewById(R.id.textView4)
        val text5: TextView = findViewById(R.id.textView5)
        val text6: TextView = findViewById(R.id.textView6)
        val text7: TextView = findViewById(R.id.textView7)
        val text8: TextView = findViewById(R.id.textView8)
        val text9: TextView = findViewById(R.id.textView9)
        var count: Int = 1
        var place: Int = 0
        Rolling.setOnClickListener {
            if (place == 0) {
                text3.text = ""
                text6.text = ""
                text8.text = ""

                text1.text = (count).toString()
                text4.text = (count).toString()
                text9.text = (count).toString()
                count++
                place++
            } else {
                if (place == 1) {
                    text1.text = ""
                    text4.text = ""
                    text9.text = ""

                    text2.text = (count).toString()
                    text5.text = (count).toString()
                    text7.text = (count).toString()
                    count++
                    place++
                } else {
                    if (place == 2){
                        text2.text = ""
                        text5.text = ""
                        text7.text = ""

                        text3.text = (count).toString()
                        text6.text = (count).toString()
                        text8.text = (count).toString()
                        count++
                        place = 0
                    }
                }
            }
        }
    }
}
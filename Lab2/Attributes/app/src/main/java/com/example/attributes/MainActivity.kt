package com.example.attributes

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val Edit_text_1:EditText = findViewById(R.id.Edit_text_id)//EditText

        val Button_black: Button = findViewById(R.id.black_text_id)// Кнопка Черный текст
        val Button_red: Button = findViewById(R.id.red_text_id)// Кнопка Красный текст

        val Size8sp: Button = findViewById(R.id.size8)//Размер 8
        val Size24sp: Button = findViewById(R.id.size24)//Размер 24

        val Button_white_background: Button = findViewById(R.id.white_background_id)//Цвет фона Белый
        val Button_yellow_background: Button = findViewById(R.id.yellow_background_id)//Цвет фона Желтый

        Button_red.setOnClickListener {
            Edit_text_1.setTextColor(Color.RED)//Красим текст в Красный
        }
        Button_black.setOnClickListener {
            Edit_text_1.setTextColor(Color.BLACK)//Красим текст в Черный
        }
        Size8sp.setOnClickListener {
            Edit_text_1.textSize = 8f//Изменяем размер теста на 8
        }
        Size24sp.setOnClickListener {
            Edit_text_1.setTextSize(24f)//Изменяем размер теста на 24
        }
        Button_white_background.setOnClickListener {
            Edit_text_1.setBackgroundColor(Color.WHITE)//Делаем фон Белым
        }
        Button_yellow_background.setOnClickListener {
            Edit_text_1.setBackgroundColor(Color.YELLOW)//Делаем фон Желтым
        }
    }
}
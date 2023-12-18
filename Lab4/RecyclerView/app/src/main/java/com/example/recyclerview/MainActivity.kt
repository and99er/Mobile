package com.example.recyclerview

import android.annotation.SuppressLint
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast
import androidx.core.graphics.toColor
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.parcelize.Parcelize



class MainActivity : AppCompatActivity(), CellClickListener {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val recyclerView: RecyclerView = findViewById(R.id.rView)

        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = Adapter(this,myColor(),this)
    }
    private fun myColor(): ArrayList<ColorData>{
        val colorList = ArrayList<ColorData>()

        colorList.add(ColorData("Red","#FF0000"))
        colorList.add(ColorData("LightSeaGreen","#20B2AA"))
        colorList.add(ColorData("Aqua","#00FFFF"))
        colorList.add(ColorData("Orange","#FFA500"))
        colorList.add(ColorData("Yellow","#FFFF00"))
        colorList.add(ColorData("Khaki","#F0E68C"))
        colorList.add(ColorData("PowderBlue","#B0E0E6"))
        colorList.add(ColorData("LightSalmon","#FFA07A"))
        colorList.add(ColorData("MediumVioletRed","#C71585"))
        colorList.add(ColorData("Gold","#FFD700"))
        colorList.add(ColorData("Moccasin","#FFE4B5"))
        colorList.add(ColorData("MidnightBlue","#191970"))
        colorList.add(ColorData("Indigo","#4B0082"))
        colorList.add(ColorData("Magenta","#FF00FF"))
        colorList.add(ColorData("Gray","#808080"))
        colorList.add(ColorData("Purple","#800080"))
        colorList.add(ColorData("Black","#000000"))
        colorList.add(ColorData("SaddleBrown","#8B4513"))
        colorList.add(ColorData("White","#FFFFFF"))
        return colorList
    }
    override fun onCellClickListener(holder: Adapter.ViewHolder){
        Toast.makeText(this,"IT'S ${holder.ColorName.text}", Toast.LENGTH_SHORT).show()
    }
}
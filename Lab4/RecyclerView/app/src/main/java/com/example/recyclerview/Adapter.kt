package com.example.recyclerview


import android.content.Context
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView


class Adapter(private val context: Context, private val ColorList: ArrayList<ColorData>,
              private val cellClickListener: CellClickListener)
    : RecyclerView.Adapter<Adapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view){
        val ColorName:TextView = itemView.findViewById(R.id.ColorName)
        val ColorHex:View = itemView.findViewById(R.id.ColorHex)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.rview_item, parent,
            false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        return ColorList.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val data = ColorList[position]
        holder.ColorName.text = data.ColorName
        holder.ColorHex.setBackgroundColor(Color.parseColor(data.ColorHex))
        holder.itemView.setOnClickListener {
            cellClickListener.onCellClickListener(holder)
        }
    }
}
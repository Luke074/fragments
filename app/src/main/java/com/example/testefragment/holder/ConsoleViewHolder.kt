package com.example.testefragment.holder

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.model.Console

class ConsoleViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textConsoleName = itemView.findViewById<TextView>(R.id.text_view_console_name)
    val textConsoleRealessDate = itemView.findViewById<TextView>(R.id.text_view_console_realess_date)
    val textConsoleMaker = itemView.findViewById<TextView>(R.id.text_view_console_maker)
    val imageConsole = itemView.findViewById<TextView>(R.id.image_view_console)
//    val imageConsole = itemView.findViewById<ImageView>(R.id.image_view_console)

    fun bind(console: Console) {
        textConsoleName.text = console.consoleName
        textConsoleMaker.text = console.consoleMaker
        textConsoleRealessDate.text = console.consoleRealessDate
        imageConsole.text = console.consoleImage
//        imageConsole.setImageDrawable(console.consoleImage)

    }
}
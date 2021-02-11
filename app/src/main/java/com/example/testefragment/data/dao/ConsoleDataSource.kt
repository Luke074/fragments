package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console

class ConsoleDataSource {
    companion object{
        fun getConsoles(context: Context): ArrayList<Console>{
            var consoles = ArrayList<Console>()

            consoles.add(Console(1,
                "Nintendo Wii",
                "Nintendo",
                "2006-11-19",
                context.getDrawable(R.drawable.wii)!!))
            consoles.add(Console(2,
                "NES",
                "Nintendo",
                "1983-07-15",
                context.getDrawable(R.drawable.nes)!!))
            consoles.add(Console(3,
                "PlayStation 1",
                "PlayStation",
                "1994-12-03",
                context.getDrawable(R.drawable.play)!!))


            return consoles
        }
    }

}
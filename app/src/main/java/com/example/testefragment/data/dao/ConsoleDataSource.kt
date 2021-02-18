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
            consoles.add(Console(4,
                "PlayStation 2",
                "PlayStation",
                "2000-03-04",
                context.getDrawable(R.drawable.play2)!!))
            consoles.add(Console(5,
                "Playstation 3",
                "PlayStation",
                "2006-11-11",
                context.getDrawable(R.drawable.play3)!!))
            consoles.add(Console(6,
                "Playstation 4",
                "PlayStation",
                "2013-11-15",
                context.getDrawable(R.drawable.ps4)!!))
            consoles.add(Console(7,
                "Nintendo Switch",
                "Nintendo",
                "2017-03-03",
                context.getDrawable(R.drawable.nintendo_switch)!!))
            consoles.add(Console(8,
                "Nintendo 64",
                "Nintendo",
                "1996-06-23",
                context.getDrawable(R.drawable.nintendo_64)!!))


            return consoles
        }
    }

}
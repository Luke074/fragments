package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.R
import com.example.testefragment.model.Console
import com.example.testefragment.model.Game

class GameDataSource {

    companion object{
        fun getGames(context: Context): ArrayList<Game>{
            var games = ArrayList<Game>()

            games.add(Game(1,
                "sonic unleashed",
                context.getDrawable(R.drawable.sonic)!!,
                "Sonic Unleashe é um jogo muito bom, mas com alguns bugs",
                4.5f,
                listOf(
                    Console(1, "Nintendo Wii", "Nintendo", "2006-11-19", context.getDrawable(R.drawable.wii)!!),
                    Console(2,"Playstation 3", "Sony", "2006-11-11", context.getDrawable(R.drawable.wii)!!)
                ))
            )
            games.add(Game(2,
                "Super Mario Bros",
                context.getDrawable(R.drawable.mario_bros)!!,
                "Super Mario Bros é um jogo classico",
                4f, listOf(
                    Console(3, "NES", "Nintendo", "1985-09-13", context.getDrawable(R.drawable.wii)!!)
                ))
            )
            games.add(Game(3,
                "Megaman",
                context.getDrawable(R.drawable.megaman)!!,
                "A famosa série Mega Man X está de volta! Jogue como Mega Man X - o poderoso sucessor do clássico robô de luta Mega Man - " +
                        "enquanto ele luta contra uma variedade de chefes mortais conhecidos como Mavericks em quatro títulos de sucesso.",
                4f,
                listOf(
                    Console(4, "Super Nintendo", "Nintendo", "1990-11-21", context.getDrawable(R.drawable.wii)!!)
                ))
            )

            return games
        }
    }

}
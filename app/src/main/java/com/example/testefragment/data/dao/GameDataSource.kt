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
                context.getDrawable(R.drawable.sonic_unleashed)!!,
                "Sonic Unleashe é um jogo muito bom, mas com alguns bugs",
                4.5,
                listOf(Console(1, "Wii", "Nintendo", "2006-11-19"),
                    Console(2,"Playstation 3", "Sony", "2006-11-11")
                ))
            )
            games.add(Game(2,
                "Super Mario Bros",
                context.getDrawable(R.drawable.mario_bros)!!,
                "Super Mario Bros é um jogo classico",
                5.0, listOf(Console(3, "Nintendinho(NES)", "Nintendo", "1985-09-13")
                ))
            )

            return games
        }
    }

}
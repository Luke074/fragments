package com.example.testefragment.data.dao

import android.content.Context
import androidx.room.Room

class Database {
    companion object{
        fun getDatabase(context: Context): AppDataBase {
            return Room.databaseBuilder(
                context,
                AppDataBase::class.java,
                "db_games"
            ).allowMainThreadQueries().build()
        }
    }
}
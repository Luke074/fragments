package com.example.testefragment.data.dao

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.testefragment.model.Console

@Database(entities = [Console::class], version = 1)
abstract class AppDataBase : RoomDatabase() {

    abstract fun consoleDao() : ConsoleDao
}
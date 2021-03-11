package com.example.testefragment.data.dao

import android.content.Context
import com.example.testefragment.model.Console

class ConsoleDataSource {
    companion object{
        fun getConsoles(context: Context): List<Console> {

            val consolesDao = Database.getDatabase(context).consoleDao()
            return consolesDao.listarTodos()
        }
    }

}
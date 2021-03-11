package com.example.testefragment.data.dao

import androidx.room.*
import com.example.testefragment.model.Console
import com.example.testefragment.model.Game

@Dao
interface ConsoleDao {
    @Insert
    fun salvar(console: Console)
    @Update
    fun atualizar(console: Console)
    @Query("SELECT * FROM console ORDER BY id ASC")
    fun listarTodos() : List<Console>
    @Query("SELECT * FROM console WHERE id = :id")
    fun listarPorId(id: Int): Console
    @Delete
    fun excluir(console: Console)
}
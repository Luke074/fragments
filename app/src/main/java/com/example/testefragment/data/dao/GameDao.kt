package com.example.testefragment.data.dao

import androidx.room.*
import com.example.testefragment.model.Game

@Dao
interface GameDao {
    @Insert
    fun salvar(game: Game)
    @Update
    fun atualizar(game: Game)
    @Query("SELECT * FROM game ORDER BY id ASC")
    fun listarTodos() : List<Game>
    @Query("SELECT * FROM game WHERE id = :id")
    fun listarPorId(id: Int): Game
    @Delete
    fun excluir(game: Game)
}
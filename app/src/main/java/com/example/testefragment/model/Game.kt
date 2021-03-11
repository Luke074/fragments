package com.example.testefragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Game(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "gameName")
    var gameName: String,
    @ColumnInfo(name = "gameImage")
    var gameImage: Drawable,
    @ColumnInfo(name = "gameDescription")
    var gameDescriptor: String,
    @ColumnInfo(name = "gameRating")
    var gameRating: Float,
    var consoles: List<Console>
)
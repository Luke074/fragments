package com.example.testefragment.model

import android.graphics.drawable.Drawable
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Console(
    @PrimaryKey(autoGenerate = true)
    var id: Int = 0,
    @ColumnInfo(name = "consoleName")
    var consoleName: String,
    @ColumnInfo(name = "consoleMaker")
    var consoleMaker: String,
    @ColumnInfo(name = "consoleRealessDate")
    var consoleRealessDate: String,
    @ColumnInfo(name = "consoleImage")
    val consoleImage: String
)
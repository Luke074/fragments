package com.example.testefragment.model

import android.graphics.drawable.Drawable

data class Game(
    var id: Long,
    var gameName: String,
    var gameImage: Drawable,
    var gameDescriptor: String,
    var gameRating: Float,
    var consoles: List<Console>
)
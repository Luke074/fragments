package com.example.testefragment.model

import android.graphics.drawable.Drawable

data class Console(
    var id: Long,
    var consoleName: String,
    var consoleMaker: String,
    var consoleRealessDate: String,
    val consoleImage: Drawable
) {

}
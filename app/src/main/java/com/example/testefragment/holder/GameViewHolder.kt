package com.example.testefragment.holder

import android.view.ContextThemeWrapper
import android.view.View
import android.widget.ImageView
import android.widget.RatingBar
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.model.Game
import com.google.android.material.chip.Chip
import com.google.android.material.chip.ChipGroup

class GameViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
    val textGameName = itemView.findViewById<TextView>(R.id.text_view_game_name)
    val textGameDescription = itemView.findViewById<TextView>(R.id.text_view_game_description)
    val ratingBarGame = itemView.findViewById<RatingBar>(R.id.rating_bar_game)
    val imageGame = itemView.findViewById<ImageView>(R.id.image_view_game)
    val chipGroupConsole = itemView.findViewById<ChipGroup>(R.id.chip_group_consoles)

    fun bind(game: Game) {
        textGameName.text = game.gameName
        textGameDescription.text = game.gameDescriptor
        ratingBarGame.rating = game.gameRating
        imageGame.setImageDrawable(game.gameImage)

        for (console in game.consoles) {
            val chip = Chip(ContextThemeWrapper(
                itemView.context, R.style.ChipTextAppeareance
            ), null, 0)
            chip.text = console.consoleName
            chipGroupConsole.addView(chip)
        }
    }

}
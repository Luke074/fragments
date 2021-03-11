package com.example.testefragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.adapter.GameAdapter
import com.example.testefragment.data.dao.GameDataSource
import com.example.testefragment.model.Game

class GamesFragment : Fragment() {
    private lateinit var recyclreGame: RecyclerView
    private val gameAdapter = GameAdapter()
    private var gameList = listOf<Game>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //tornar o menu visivel na view
        setHasOptionsMenu(true)

        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_games, container, false)

        //Intanciar a RecyclerView
        recyclreGame = view.findViewById(R.id.recycler_view_games)

        //Determinar a orientação da RecyclerView
        recyclreGame.layoutManager = LinearLayoutManager(view.context)

        //Informar para a RecyclerView quem é o adapter que ela vai usar
        recyclreGame.adapter = gameAdapter

//        //Dizer ao adapter qual é a fonte de dados
//        gameList = GameDataSource.getGames(view.context)
//
//        //Atualizar a lsita de jogos do adapter
//        gameAdapter.updateGameList(gameList)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)

        inflater.inflate(R.menu.menu_game, menu)
    }
}
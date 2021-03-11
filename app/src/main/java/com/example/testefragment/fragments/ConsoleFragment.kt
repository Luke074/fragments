package com.example.testefragment.fragments

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.testefragment.R
import com.example.testefragment.adapter.ConsoleAdapter
import com.example.testefragment.data.dao.ConsoleDao
import com.example.testefragment.data.dao.ConsoleDataSource
import com.example.testefragment.data.dao.Database
import com.example.testefragment.model.Console

class ConsoleFragment : Fragment() {

    private lateinit var recyclerConsole: RecyclerView
    private val consoleAdapter = ConsoleAdapter()
    private var consoleList = listOf<Console>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_console, container, false)

        recyclerConsole = view.findViewById(R.id.recycler_view_console)
        recyclerConsole.layoutManager = GridLayoutManager(view.context, 2, LinearLayoutManager.VERTICAL, false)
        recyclerConsole.adapter = consoleAdapter

        consoleList = ConsoleDataSource.getConsoles(view.context)

        consoleAdapter.updateConsoleList(consoleList)

        return view
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
    }
}
package com.example.testefragment

import android.media.Image
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.Fragment
import com.example.testefragment.fragments.ConsoleFragment
import com.example.testefragment.fragments.GamesFragment
import com.example.testefragment.fragments.HomeFragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity(),
    View.OnClickListener, BottomNavigationView.OnNavigationItemSelectedListener, NavigationView.OnNavigationItemSelectedListener{

    private lateinit var buttonHome: Button
    private lateinit var buttonConsoles: Button
    private lateinit var buttonGames: Button

    private lateinit var homeFragment: HomeFragment
    private lateinit var gamesFragment: GamesFragment
    private lateinit var consoleFragment: ConsoleFragment

    private lateinit var bottomNavigation: BottomNavigationView

    private lateinit var navigationView: NavigationView

    private lateinit var toolbar: Toolbar

    private lateinit var drawer: DrawerLayout

    private lateinit var imageButtonAddConsole: ImageButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.drawer_navigation_layout)

        homeFragment = HomeFragment()
        gamesFragment = GamesFragment()
        consoleFragment = ConsoleFragment()

        bottomNavigation = findViewById(R.id.bottom_navigation)
        bottomNavigation.setOnNavigationItemSelectedListener(this)

        navigationView = findViewById(R.id.navigation_view)
        navigationView.setNavigationItemSelectedListener(this)

        toolbar = findViewById(R.id.toolbar)
        toolbar.setTitle("Home")
        setSupportActionBar(toolbar)

//        imageButtonAddConsole = findViewById(R.id.image_button_add_console)
//        imageButtonAddConsole.setOnClickListener(this)

        drawer = findViewById(R.id.drawer_layout)

        // Adicionar botão que abre o drawer menu
        var toggle =
            ActionBarDrawerToggle(this,
            drawer,
            toolbar,
            R.string.open_drawer,
            R.string.close_drawer)

        drawer.addDrawerListener(toggle)
        toggle.syncState()

        supportFragmentManager.beginTransaction()
            .replace(R.id.frame, homeFragment).commit()
    }

    override fun onClick(v: View) {
//        when (v.id){
//            R.id.button_home -> {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.frame, homeFragment).commit()
//            }
//            R.id.button_console -> {
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.frame, consoleFragment).commit()
//            }
//            R.id.button_games -> {g
//                supportFragmentManager.beginTransaction()
//                    .replace(R.id.frame, gamesFragment).commit()
//            }
//        }
    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {
        when (item.itemId) {
            R.id.menu_home -> {
                setFragment(homeFragment)
                toolbar.title = "Home"
            }
            R.id.menu_console -> {
                setFragment(consoleFragment)
                toolbar.title = "Consoles"
            }
            R.id.menu_games -> {
                setFragment(gamesFragment)
                toolbar.title = "Games"
            }
        }

        var selectedMenu = bottomNavigation.menu.findItem(item.itemId)
        selectedMenu.setChecked(true)

        if(drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START)
        }
        return true
    }

    fun setFragment(fragment: Fragment){
        supportFragmentManager
            .beginTransaction()
            .replace(R.id.frame, fragment)
            .commit()
    }

}
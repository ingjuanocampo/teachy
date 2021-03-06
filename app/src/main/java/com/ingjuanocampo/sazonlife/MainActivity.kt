package com.ingjuanocampo.sazonlife

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val navView: BottomNavigationView = findViewById(R.id.nav_view)

        val navController = findNavController(R.id.nav_host_fragment)
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        val appBarConfiguration = AppBarConfiguration(setOf(
                R.id.navigation_explore,
            R.id.navigation_dashboard,
            R.id.createFragment,
            R.id.navigation_favorite,
            R.id.navigation_shop))
        //setupActionBarWithNavController(navController, appBarConfiguration)
        navView.inflateMenu(R.menu.menu_manager)
        navView.setupWithNavController(navController)

        icon_account.setOnClickListener {

            ItemListDialogFragment.newInstance().show(supportFragmentManager, "dialog")

        }
    }
}
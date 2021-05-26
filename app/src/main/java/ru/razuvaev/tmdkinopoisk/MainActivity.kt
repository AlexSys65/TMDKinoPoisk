package ru.razuvaev.tmdkinopoisk

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.bottomnavigation.BottomNavigationView
import ru.razuvaev.tmdkinopoisk.ui.main.MainFragment
import ru.razuvaev.tmdkinopoisk.ui.main.SettingFragment

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
        if (savedInstanceState == null) {
            supportFragmentManager.beginTransaction()
                .replace(R.id.container, MainFragment.newInstance())
                .commitNow()
        }

        val bottomNavigation: BottomNavigationView = findViewById(R.id.nav_view)
        bottomNavigation.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.navigation_home -> {Toast.makeText(this, "Home", Toast.LENGTH_SHORT).show()}
                R.id.navigation_search -> {Toast.makeText(this, "Search", Toast.LENGTH_SHORT).show()}
                R.id.navigation_settings -> {Toast.makeText(this, "Setting", Toast.LENGTH_SHORT).show()}
            }
            true
        }

    }
}
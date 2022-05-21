package com.example.gestorpeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.example.gestorpeliculas.Fragments.AboutFragment
import com.google.android.material.internal.NavigationMenu
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawermain: DrawerLayout
    private lateinit var navMenu : NavigationView

    //definicion de fragments
    private val fragmentAbout = AboutFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawermain= findViewById(R.id.drawermain)
        navMenu = findViewById(R.id.navMenu)

        navMenu.setNavigationItemSelectedListener {
            it.setChecked(true)
            val f= supportFragmentManager.beginTransaction()
            when(it.itemId){
                R.id.carteleras -> MostrarFragmentCartelera(f)
                R.id.aboutus -> MostrarFragmentAbout(f)
            }
            drawermain.closeDrawers()
            true
        }
        //fragment x defecto
        val f= supportFragmentManager.beginTransaction()
        f.add(R.id.fcvsecciones, fragmentAbout)
        f.commit()
    }



    //Funciones para mostrar fragments
    private fun MostrarFragmentAbout(f: FragmentTransaction) {
            f.replace(R.id.fcvsecciones, fragmentAbout)
    }

    private fun MostrarFragmentCartelera(f: FragmentTransaction) {
        TODO("Not yet implemented")
    }
}
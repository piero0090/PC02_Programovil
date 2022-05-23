package com.example.gestorpeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.TextView
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.example.gestorpeliculas.adapters.ListadoPeliculasAdapter
import com.example.gestorpeliculas.fragments.AboutFragment
import com.example.gestorpeliculas.fragments.CarteleraFragment
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawermain: DrawerLayout
    private lateinit var navMenu : NavigationView
    private lateinit var tviUsername : TextView
    private lateinit var tviUsername2 : TextView



    //definicion de fragments
    private val fragmentAbout = AboutFragment()
    private val fragmentCartelera = CarteleraFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawermain= findViewById(R.id.drawermain)
        navMenu = findViewById(R.id.navMenu)
        //val header = findViewById<TextView>(R.id.edTxt)


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

        val nombre = intent.getStringExtra("USERNAME")
        tviUsername = navMenu.getHeaderView(0).findViewById(R.id.hNombre)
        tviUsername.setText(nombre)




        //fragment x defecto
        val f= supportFragmentManager.beginTransaction()
        f.add(R.id.fcvsecciones, fragmentCartelera)

        f.commit()


    }

    //Funciones para mostrar fragments
    private fun MostrarFragmentAbout(f: FragmentTransaction) {
        val f= supportFragmentManager.beginTransaction()
        f.add(R.id.fcvsecciones, fragmentAbout)
        f.commit()
    //f.replace(R.id.fcvsecciones, fragmentAbout)
    }

    private fun MostrarFragmentCartelera(f: FragmentTransaction) {
        val f= supportFragmentManager.beginTransaction()
        f.add(R.id.fcvsecciones, fragmentCartelera)
        f.commit()
        //f.replace(R.id.fcvsecciones, fragmentCartelera)
    }


}
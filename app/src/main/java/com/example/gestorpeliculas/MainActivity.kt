package com.example.gestorpeliculas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.activity.result.contract.ActivityResultContracts
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentTransaction
import com.example.gestorpeliculas.Fragments.AboutFragment
import com.example.gestorpeliculas.Fragments.CarteleraFragment
import com.google.android.material.internal.NavigationMenu
import com.google.android.material.navigation.NavigationView

class MainActivity : AppCompatActivity() {

    private lateinit var drawermain: DrawerLayout
    private lateinit var navMenu : NavigationView

    //definicion de fragments
    private val fragmentAbout = AboutFragment()
    private val fragmentCartelera = CarteleraFragment()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawermain= findViewById(R.id.drawermain)
        navMenu = findViewById(R.id.navMenu)
        val header = findViewById<TextView>(R.id.edTxt)


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
        /*val f= supportFragmentManager.beginTransaction()
        f.add(R.id.fcvsecciones, fragmentAbout)
        f.commit()*/

        val nombre = intent.getStringExtra("USERNAME")
        val tviUsername = findViewById<TextView>(R.id.PRUEBATXT)
        Log.i("MainActivity", "hola "+ nombre+ " "+  tviUsername.text.toString())
        tviUsername.setText("Hola, " + nombre)
        Log.i("MainActivity", "hola "+ nombre+ " "+  tviUsername.text.toString())

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
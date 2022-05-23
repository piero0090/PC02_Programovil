package com.example.gestorpeliculas.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gestorpeliculas.R
import com.example.gestorpeliculas.models.GestorPeliculas
import com.example.gestorpeliculas.models.beans.Pelicula

class Listado_Peliculas(private val mListaPeliculas : List<Pelicula>)
    : RecyclerView.Adapter<Listado_Peliculas.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val tviPeliculaNombre : TextView
        init {
            tviPeliculaNombre = view.findViewById(R.id.tviPeliculaNombre)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
       val pelicula = mListaPeliculas[position]
       holder.tviPeliculaNombre.text = pelicula.nombre
    }

    override fun getItemCount(): Int {
        return mListaPeliculas.size    }
}
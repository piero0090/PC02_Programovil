package com.example.gestorpeliculas.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gestorpeliculas.R
import com.example.gestorpeliculas.models.beans.Pelicula

class ListadoPeliculasAdapter(private val mListaPeliculas : List<Pelicula>,
                              private val mOnItemClickListener : (pelicula : Pelicula) -> Unit)
    : RecyclerView.Adapter<ListadoPeliculasAdapter.ViewHolder>() {
    class ViewHolder(view: View) : RecyclerView.ViewHolder(view){
        val itemPeliculaNombre : TextView
        val itemPeliculaHora: TextView

        init {
            itemPeliculaNombre = view.findViewById(R.id.itemPeliculaNombre)
            itemPeliculaHora = view.findViewById(R.id.itemPeliculaHora)
    }
}

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_list, parent, false)
        val viewHolder = ViewHolder(view)
        return viewHolder
}

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val pelicula = mListaPeliculas[position]
        holder.itemPeliculaNombre.text = pelicula.nombre
        holder.itemPeliculaHora.text = pelicula.hora

    }

    override fun getItemCount(): Int {
        return mListaPeliculas.size    }
}
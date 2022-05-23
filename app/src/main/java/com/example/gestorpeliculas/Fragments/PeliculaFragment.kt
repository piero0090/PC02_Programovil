package com.example.gestorpeliculas.Fragments

import android.os.Bundle
import android.util.Log
import android.view.*
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.RecyclerView
import com.example.gestorpeliculas.Adapters.Listado_Peliculas
import com.example.gestorpeliculas.R
import com.example.gestorpeliculas.models.GestorPeliculas
import com.example.gestorpeliculas.models.beans.Pelicula

class PeliculaFragment : Fragment() {
    private lateinit var mRviPeliculas : RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activity?.title = "Peliculas"
        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_cartelera, container, false)
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.menu_peliculas, menu)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        mRviPeliculas = view.findViewById(R.id.rviPeliculas)

        val listaPeliculas : List<Pelicula> = GestorPeliculas().obtenerListaPeliculas()
        val adapter = Listado_Peliculas(listaPeliculas) {
            Log.i("fragment","Se hizo click en el planeta " + it.nombre);
        }
        mRviPlanetas.adapter = adapter

    }
}
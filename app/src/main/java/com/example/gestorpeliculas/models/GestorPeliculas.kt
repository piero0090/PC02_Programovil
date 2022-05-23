package com.example.gestorpeliculas.models;
import com.example.gestorpeliculas.models.beans.Pelicula

public class GestorPeliculas {

    fun obtenerListaPeliculas() : List<Pelicula> {
        return listOf(
                Pelicula("Dr.Strange 2", "15:00"),
                Pelicula("Top Gun 2", "17:00"),
                Pelicula("Detective Pikachu", "11:00")
                )
        }

}

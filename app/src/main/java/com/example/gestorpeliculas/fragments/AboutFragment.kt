package com.example.gestorpeliculas.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.gestorpeliculas.LoginActivity
import com.example.gestorpeliculas.R

class AboutFragment : Fragment(){

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //Proceso de inflado del fragment About
        return inflater.inflate(R.layout.fragment_about, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        view.findViewById<Button>(R.id.btnRegresar).setOnClickListener{
            val i: Intent=Intent()
            i.setClass(requireContext(), LoginActivity::class.java)
            startActivity(i)
        }
    }


}
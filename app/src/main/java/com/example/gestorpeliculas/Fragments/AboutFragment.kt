package com.example.gestorpeliculas.Fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.SurfaceControl
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentTransaction
import com.example.gestorpeliculas.LoginActivity
import com.example.gestorpeliculas.MainActivity
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
package com.example.gestorpeliculas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import android.view.Menu
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : Activity(){

    private  var btnLogin: Button? =null
    private var mEdtNombre : EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        mEdtNombre= findViewById(R.id.edtnombre)
        btnLogin=findViewById(R.id.btnlogininicial)

        btnLogin?.setOnClickListener{v:View->
            //Log.i("LoginActivy", mEdtNombre.text.toString())
            val nombre : String = mEdtNombre!!.text.toString()

            val intent: Intent= Intent()
            intent.setClass(this, MainActivity::class.java)

            // Pasar parametros

            val data = Bundle()
            data.putString("USERNAME", nombre)
            intent.putExtras(data)

            startActivity(intent)
        }

    }
}
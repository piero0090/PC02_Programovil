package com.example.gestorpeliculas

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.view.Menu
import android.view.View
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : Activity(){

    private  var btnLogin: Button? =null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.layout_login)

        btnLogin=findViewById(R.id.btnlogininicial)
        btnLogin?.setOnClickListener{v:View->
            val intent: Intent= Intent()
            intent.setClass(this, MainActivity::class.java)

            startActivity(intent)
        }
    }
}
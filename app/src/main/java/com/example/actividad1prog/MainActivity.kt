package com.example.actividad1prog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.content.Intent
import android.net.Uri
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnAEntrenar = findViewById<Button>(R.id.btnAEntrenar)


        btnAEntrenar.setOnClickListener {
            Log.i("MENU -----", "ingreso a menu")
            navegarHaciaApp(menuIntermedio::class.java) //
        }

    }
    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }
}
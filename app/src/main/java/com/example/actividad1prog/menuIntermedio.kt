package com.example.actividad1prog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class menuIntermedio : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu_intermedio)
        val btnDietas = findViewById<Button>(R.id.btnDietas)
        val btnEjercicios = findViewById<Button>(R.id.btnEjercicios)
        val btnEjerciciosRapidos = findViewById<Button>(R.id.btnEjerciciosRapidos)
        val btnVolver = findViewById<Button>(R.id.btnVolver)

        //EVENTOS:

        btnDietas.setOnClickListener {
            Log.i("MENU -----", "LANZAMOS MENU DE DIETAS")
            navegarHaciaApp(VideoGym::class.java)
        }

        btnEjercicios.setOnClickListener {
            Log.i("MENU -----", "LANZAMOS MENU DE EJERCICIOS")
            navegarHaciaApp(VideoGym::class.java)
        }

        btnEjerciciosRapidos.setOnClickListener {
            Log.i("MENU -----", "LANZAMOS CALCULADORA")
            navegarHaciaApp(Calculadora1::class.java)
        }

        btnVolver.setOnClickListener {
            Log.i("MENU -----", "REGRESAMOS AL MENU ANTERIOR")
            navegarHaciaApp(MainActivity::class.java)
        }

    }


    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }

}
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
            navegarHaciaApp(VideoGym::class.java) //recordar cambiar por el activity de dietas
        }

        btnEjercicios.setOnClickListener {
            Log.i("MENU -----", "LANZAMOS MENU DE EJERCICIOS")
            navegarHaciaApp(VideoGym::class.java) //recordar cambiar por el activity de ejercicios
        }

        btnEjerciciosRapidos.setOnClickListener {
            Log.i("MENU -----", "LANZAMOS MENU DE EJERCICIOS HIT")
            navegarHaciaApp(VideoGym::class.java) //recordar cambiar por el activity de ejercicios Rapidos
        }

        btnVolver.setOnClickListener {
            Log.i("MENU -----", "REGRESAMOS AL MENU ANTERIOR")
            navegarHaciaApp(MainActivity::class.java) //recordar cambiar por el activity principal
        }

    }


    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }

}
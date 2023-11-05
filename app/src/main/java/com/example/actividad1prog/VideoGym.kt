package com.example.actividad1prog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class VideoGym : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videogym)

        //PRIMERO RECUPERAR EL BOTTON
        val btnVolver=findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVolver.id} PULSADO----- boton")
        }
        val btnVideoPierna=findViewById<Button>(R.id.btnVideoPierna)
        btnVideoPierna.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVideoPierna.id} PULSADO----- boton")
        }
        val btnVideoBrazo=findViewById<Button>(R.id.btnVideoBrazo)
        btnVideoBrazo.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVideoBrazo.id} PULSADO----- boton")
        }
        val btnVideoPecho=findViewById<Button>(R.id.btnVideoPecho)
        btnVideoPecho.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVideoPecho.id} PULSADO----- boton")
        }
    }
}
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
    }
}
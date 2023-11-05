package com.example.actividad1prog

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Calculadora1 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculadora1)



        //Capturar boton, editTxts, txtResultado
        val edtEdad = findViewById<EditText>(R.id.edtEdad)
        val edtPeso = findViewById<EditText>(R.id.edtPeso)
        val edtAltura = findViewById<EditText>(R.id.edtAltura)
        val txtResult = findViewById<TextView>(R.id.txtResult)
        val btnCalcular = findViewById<Button>(R.id.btnCalcular)

        val btnVolver=findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVolver.id} PULSADO----- boton")
            navegarHaciaApp(menuIntermedio::class.java)
        }
        //Listener sobre el boton
        btnCalcular.setOnClickListener {
            //Calculo de tiempo de ejercicios
            val edadNum: Int? = edtEdad.text.toString().toIntOrNull()
            val pesoNum: Int? = edtPeso.text.toString().toIntOrNull()
            val alturaNum: Int? = edtAltura.text.toString().toIntOrNull()
            if (edadNum != null && pesoNum != null && alturaNum != null) {
                val tiempoejercicio = edadNum - pesoNum + alturaNum
                //Devolucion
                txtResult.text = tiempoejercicio.toString()
            } else {
                txtResult.text = "Datos Incorrectos"
            }
        }
    }
    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }
}
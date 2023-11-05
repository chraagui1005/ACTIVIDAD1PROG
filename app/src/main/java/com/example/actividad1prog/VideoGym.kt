package com.example.actividad1prog

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.widget.Button

class VideoGym : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.videogym)

        val webView: WebView = findViewById(R.id.webView)
        val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aoHGavS1XPY?si=yoMwJ8-BohlPgeBM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
        webView.loadData(video, "text/html", "utf-8")
        webView.settings.javaScriptEnabled = true
        webView.webChromeClient = WebChromeClient()


        //PRIMERO RECUPERAR EL BOTTON
        val btnVolver=findViewById<Button>(R.id.btnVolver)
        btnVolver.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVolver.id} PULSADO----- boton")
            navegarHaciaApp(menuIntermedio::class.java)
        }
        val btnVideoPierna=findViewById<Button>(R.id.btnVideoPierna)
        btnVideoPierna.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVideoPierna.id} PULSADO----- boton")
            val webView: WebView = findViewById(R.id.webView)
            val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/aoHGavS1XPY?si=yoMwJ8-BohlPgeBM\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
            webView.loadData(video, "text/html", "utf-8")
            webView.settings.javaScriptEnabled = true
            webView.webChromeClient = WebChromeClient()
        }
        val btnVideoBrazo=findViewById<Button>(R.id.btnVideoBrazo)
        btnVideoBrazo.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVideoBrazo.id} PULSADO----- boton")
            val webView: WebView = findViewById(R.id.webView)
            val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/iIdReY7T-4s?si=AaL0U0cE1pcue-cy\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
            webView.loadData(video, "text/html", "utf-8")
            webView.settings.javaScriptEnabled = true
            webView.webChromeClient = WebChromeClient()
        }
        val btnVideoPecho=findViewById<Button>(R.id.btnVideoPecho)
        btnVideoPecho.setOnClickListener {
            Log.i("ACTIVIDAD1PROG", "------BOTON ${btnVideoPecho.id} PULSADO----- boton")
            val webView: WebView = findViewById(R.id.webView)
            val video = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/VB09kLgJDo0?si=16ikr0y-yDJrTIOS\" title=\"YouTube video player\" frameborder=\"0\" allow=\"accelerometer; autoplay; clipboard-write; encrypted-media; gyroscope; picture-in-picture; web-share\" allowfullscreen></iframe>"
            webView.loadData(video, "text/html", "utf-8")
            webView.settings.javaScriptEnabled = true
            webView.webChromeClient = WebChromeClient()
        }
    }
    fun navegarHaciaApp(clase:Class<*>){
        val intent = Intent(this, clase)
        startActivity(intent)
    }
}
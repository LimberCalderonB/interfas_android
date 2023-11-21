package com.example.proyecto_interfas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class comprar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_comprar)
    }
    fun comprar(view: View) {
        val intent = Intent(this, factura::class.java)
        startActivity(intent)
    }
    fun cancelar(view: View) {
        val intent = Intent(this, iniciar::class.java)
        startActivity(intent)
    }
}
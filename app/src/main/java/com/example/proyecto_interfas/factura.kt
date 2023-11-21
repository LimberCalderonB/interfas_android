package com.example.proyecto_interfas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class factura : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_factura)
    }
    fun inicio(view: View) {
        val intent = Intent(this, iniciar::class.java)
        startActivity(intent)
    }
}
package com.example.proyecto_interfas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class tester : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tester)
    }
    // Método para el clic en el botón "CREAR CUENTA"
    fun tester(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
}
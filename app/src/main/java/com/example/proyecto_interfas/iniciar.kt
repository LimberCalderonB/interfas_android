package com.example.proyecto_interfas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class iniciar : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_iniciar)
    }

    // Método para el clic en el botón "CREAR CUENTA"
    fun cerrar(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    // Método para el clic en el botón "CREAR CUENTA"
    fun tester(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
    fun res(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
    fun capa(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
    fun dio(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
    fun tran(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
    fun sen(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }
    fun led(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }fun cables(view: View) {
        val intent = Intent(this, tester::class.java)
        startActivity(intent)
    }

}
package com.example.proyecto_interfas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View


class crear_cuenta : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_crear_cuenta)

    }
    // Método para el clic en el botón "CREAR CUENTA"
    fun volver(view: View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }
    // Método para el clic en el botón "CREAR CUENTA"
    fun iniciar(view: View) {
        val intent = Intent(this, iniciar::class.java)
        startActivity(intent)
    }

}
/*class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    // Método para el clic en el botón "CREAR CUENTA"
    fun crear(view: View) {
        val intent = Intent(this, crear_cuenta::class.java)
        startActivity(intent)
    }
}*/


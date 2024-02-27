package com.example.calculadoracomissao

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    var COD_TELA = 2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun acessar(view: View) {

        val intent = Intent(this, PaginaInicial::class.java).apply {

        }
        startActivityForResult(intent,COD_TELA)
    }
}
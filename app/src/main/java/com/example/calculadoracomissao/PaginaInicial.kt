package com.example.calculadoracomissao

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class PaginaInicial : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_pagina_inicial)
        setSupportActionBar(findViewById(R.id.toolbar))

       val btConf = findViewById<Button>(R.id.btnCalcular)
       btConf.setOnClickListener {
           var pagamento = findViewById<EditText>(R.id.Salariofixo)
           var pagamenton = pagamento?.text.toString().toDouble()
           var rodados = findViewById<EditText>(R.id.Kmrodados)
           var rodadosn = rodados?.text.toString().toDouble()
           var pagamentofinal = findViewById<EditText>(R.id.Salariofinal)
           var edtcomissao = findViewById<EditText>(R.id.comissao)
            if(rodadosn <= 500.0){
            var comissao = pagamenton*0.001
                var somaraosalario = comissao*rodadosn
                var fimdosalario = pagamenton+somaraosalario
                edtcomissao.setText("Sua comissão R$ $somaraosalario")
                pagamentofinal.setText("Seu Salário R$ $fimdosalario")
            }
           if(rodadosn >= 501.0 && rodadosn <=1000.0){
               var comissao = pagamenton*0.0015
               var somaraosalario = comissao*rodadosn
               var fimdosalario = pagamenton+somaraosalario
               edtcomissao.setText("Sua comissão R$ $somaraosalario")
               pagamentofinal.setText("Seu Salário R$ $fimdosalario")
           }
           if(rodadosn >= 1001.0 && rodadosn <=2000.0){
               var comissao =  pagamenton*0.0025
               var somaraosalario = comissao*rodadosn
               var fimdosalario = pagamenton+somaraosalario
               edtcomissao.setText("Sua comissão R$ $somaraosalario")
               pagamentofinal.setText("Seu Salário R$ $fimdosalario")
           }
           if(rodadosn >= 2001.0){
               var comissao = pagamenton*0.003
               var somaraosalario = comissao*rodadosn
               var fimdosalario = pagamenton+somaraosalario
               edtcomissao.setText("Sua comissão R$ $somaraosalario")
               pagamentofinal.setText("Seu Salário R$ $fimdosalario")
           }

       }
    }




}
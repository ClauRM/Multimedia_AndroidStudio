package com.claudiarm.variaspantallas

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //capturar botones por su id
        val button2 : Button = findViewById(R.id.buttonToScreen2)
        val button3 : Button = findViewById(R.id.buttonToScreen3)

        //listener para el boton2
        button2.setOnClickListener {
            //Información a pasar entre pantallas
            var dataScreen2 = "Datos enviado a la pantalla 2"
            //mensaje emergente
            Toast.makeText(applicationContext,"Ok botón 2 pulsado",Toast.LENGTH_SHORT).show()
            //lanzar actividad2 desde la actividad1
            val intent = Intent(this@MainActivity,MainActivity2::class.java)
            //enviar informacion extra
            intent.putExtra("Valor2",dataScreen2)
            //realizar intento
            startActivity(intent)
        }

        //listener para el boton3
        button3.setOnClickListener {
            //Información a pasar entre pantallas
            var dataScreen3 = "Datos enviado a la pantalla 3"
            //mensaje emergente
            Toast.makeText(applicationContext,"Ok botón 3 pulsado",Toast.LENGTH_SHORT).show()
            //lanzar actividad2 desde la actividad1
            val intent = Intent(this@MainActivity,MainActivity3::class.java)
            //enviar informacion extra
            intent.putExtra("Valor3",dataScreen3)
            //realizar intento
            startActivity(intent)
        }
    }


}
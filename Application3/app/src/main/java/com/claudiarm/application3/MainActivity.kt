package com.claudiarm.application3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    //Declaracion de variables globales
    private lateinit var name: EditText
    private lateinit var lastname: EditText
    private lateinit var button: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Asignacion de valores a las variables globales
        name = findViewById(R.id.fieldName)
        lastname = findViewById(R.id.fieldLastname)
        button = findViewById(R.id.buttonAccess)

        //Asignacion de evento al boton
        button.setOnClickListener{
            //Captura de valores de los campos
            val campo1 = name.text.toString()
            val campo2 = lastname.text.toString()
            //Mostrar los valores capturados en un mensaje emergente
            val mensaje = "Nombre: $campo1 - Apellidos: $campo2"
            Toast.makeText(this,mensaje,Toast.LENGTH_SHORT).show()
        }
    }
}
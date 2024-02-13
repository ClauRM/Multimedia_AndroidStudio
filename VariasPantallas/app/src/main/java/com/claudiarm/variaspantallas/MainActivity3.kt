package com.claudiarm.variaspantallas

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        //si vengo de otra pantalla a traves de un intent
        val intent = intent

        //validar que el dato recibido no es null
        if(intent != null){
            //capturar datos recibidos
            val dataRecibed = intent.getStringExtra("Valor3")
            //comprobar que se reciben datos
            if(dataRecibed != null){
                //mostrar mensaje emergente con informacion recibida del intent
                Toast.makeText(applicationContext,"Datos recibidos: "+dataRecibed, Toast.LENGTH_LONG).show()
            }
        }
    }
}
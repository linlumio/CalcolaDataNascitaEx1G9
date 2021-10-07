package com.example.calcoladatanascitaex1g9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.calcoladatanascitaex1g9.databinding.ActivityMainBinding
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        var act:ActivityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(act.root)


        println("Avvio")

        var coso: Button = findViewById(R.id.calcola)

        coso.setOnClickListener{
            println("click con il vecchio")
        }

        act.calcola.setOnClickListener {
            println("click")
            var anno = act.date.text.toString().toInt()
            println("salvato")
            var annoAttuale = Calendar.getInstance().get(Calendar.YEAR);
            println("calendario")
            act.result.text = (annoAttuale-anno).toString()


        }

    }
}
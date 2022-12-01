package com.beyzanurokudan.karaktersayisibulma

import android.R.string
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //tanimlama
    private lateinit var cikti : TextView
    private lateinit var hesapla : Button
    private lateinit var cumle : EditText

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        cikti = findViewById(R.id.cikti)
        cumle = findViewById(R.id.cumle)
        hesapla = findViewById(R.id.hesapla)

        hesapla.setOnClickListener {
            val alinanVeri = cumle.text.toString()
            cikti.text = cumle.length().toString()
        }
    }

}
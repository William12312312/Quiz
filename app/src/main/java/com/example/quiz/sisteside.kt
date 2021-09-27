package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class sisteside : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sisteside)

        val avslutt: Button = findViewById(R.id.avslutt)
        val textView: TextView = findViewById(R.id.textView)

        avslutt.setOnClickListener{
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val name = intent.getStringExtra("NAVN")
        val points = intent.getIntExtra("points", 0)
        textView.text = "Takk for at du spilte denne Quizen $name Du fikk $points poeng"


    }
    }

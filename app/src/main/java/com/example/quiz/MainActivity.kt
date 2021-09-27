package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val inputNavn: EditText = findViewById(R.id.SkrivNavnHer)
        val buttonStart: Button = findViewById(R.id.StartButton)

        buttonStart.setOnClickListener {
            if (inputNavn.text.toString().isEmpty()) {
                Toast.makeText(this, "Please enter you name", Toast.LENGTH_SHORT).show()
            } else {
                val intent = Intent(this, sporsmal02::class.java)
                intent.putExtra("NAVN", inputNavn.text.toString())
                startActivity(intent)
            }
        }
        }
        }









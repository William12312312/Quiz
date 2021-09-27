package com.example.quiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

class sporsmal02 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sporsmal02)

        val svarListe: Array<Boolean> = arrayOf(false, true, false, false, true, true, false, true, false, true)
        val sporsmaalListe: Array<String> = arrayOf(
            "1. Fetacheese is originaly from Italy?",
            "2. Humans are geneticly 50% related to bananas?",
            "3. Amazonas er verdens lengste elv?",
            "4. Adults can breath and eat at the same time?",
            "5. An octopus has three hearts?",
            "6. Lyn kan slå ned på samme sted to ganger?",
            "7. Sjøkuer følger en leder og svømmer i grupper?",
            "8. Universet ekspanderer?",
            "9. Brasil er verdens andreplass på produsering av kaffe?",
            "10. Den kinesiske mur kan man se fra månen?")

        val button_false: Button = findViewById(R.id.button_false)
        val FerdigBtn: Button = findViewById(R.id.FerdigBtn)
        val button_true: Button = findViewById(R.id.button_true)
        val sporsmal: TextView = findViewById(R.id.sporsmal)
        val points: TextView = findViewById(R.id.points)
        var sporsmalnummer: Int = 0
        val name = intent.getStringExtra("NAVN")
        var pointsnummer: Int = 0

        sporsmal.text = sporsmaalListe[sporsmalnummer]

        button_false.setOnClickListener {
            if (!svarListe[sporsmalnummer]) {
                pointsnummer++
                points.text = "${pointsnummer}"
                Toast.makeText(this, "Riktig Svar", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Feil Svar", Toast.LENGTH_SHORT).show()

            }
             sporsmalnummer++
             if (sporsmalnummer < 10) {
                 sporsmal.text = sporsmaalListe[sporsmalnummer]


        }
        }
        button_true.setOnClickListener {
            if (svarListe[sporsmalnummer]) {
                pointsnummer++
                points.text = "${pointsnummer}"
                Toast.makeText(this, "Riktig Svar", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Feil Svar", Toast.LENGTH_SHORT).show()
            }
            sporsmalnummer++
            if (sporsmalnummer < 10) {
                sporsmal.text = sporsmaalListe[sporsmalnummer]

            } 
        }

        FerdigBtn.setOnClickListener {
            val intent = Intent(this, sisteside::class.java)
            intent.putExtra("NAVN", name.toString())
            intent.putExtra("points", pointsnummer)
            startActivity(intent)
    }
    }
    }

































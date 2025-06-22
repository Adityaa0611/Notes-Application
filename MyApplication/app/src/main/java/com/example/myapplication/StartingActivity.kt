package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class StartingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_starting)
        val getStarted = findViewById<Button>(R.id.getStarted)
        getStarted.setOnClickListener {
            // open a new activity
            val intent = Intent(applicationContext, LoginActivity::class.java)
            startActivity(intent)
        }

    }
}
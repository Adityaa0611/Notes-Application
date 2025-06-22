package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_login)

        val login= findViewById<Button>(R.id.login)
        val create = findViewById<Button>(R.id.create)
        login.setOnClickListener {
            // open a new activity
            val intent = Intent(applicationContext, NotesActivity::class.java)
            startActivity(intent)
        }
        create.setOnClickListener {
            // open a new activity
            val intent = Intent(applicationContext, SignupActivity::class.java)
            startActivity(intent)
        }
    }
}
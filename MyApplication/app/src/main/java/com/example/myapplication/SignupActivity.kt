package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class SignupActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup)
        val signup = findViewById<Button>(R.id.signup)
        val signupwithgoogle = findViewById<Button>(R.id.signupwithgoogle)
        signup.setOnClickListener {
            // open a new activity
            val intent = Intent(applicationContext, NotesActivity::class.java)
            startActivity(intent)


        }
    }
}
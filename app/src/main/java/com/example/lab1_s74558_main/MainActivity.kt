package com.example.lab1_s74558_main

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

       val editName = findViewById<EditText>(R.id.editName); 
        val btnClickMe = findViewById<Button>(R.id.btnClickMe);
       val textView = findViewById<TextView>(R.id.textView);

        btnClickMe.setOnClickListener {
            val name = editName.text.toString().trim()
            if (name.isEmpty()) {
                Toast.makeText( context = this, text = "Please enter your name", duration = Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText( context = this, text = "Assalamualaikum, $name" duration = Toast.LENGTH_SHORT).show()
            }
        }
    }
}
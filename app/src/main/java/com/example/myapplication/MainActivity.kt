package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val editText = findViewById<EditText>(R.id.edit_text)
        val textView = findViewById<TextView>(R.id.text_view)
        val nextButton = findViewById<Button>(R.id.next_button)

        nextButton.setOnClickListener {
            val text = editText.text.toString()
            textView.text = text
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
    }
}
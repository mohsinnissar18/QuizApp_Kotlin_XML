package com.practice.myquiz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        val etName : EditText = findViewById(R.id.et_name)

        val btnStart : Button = findViewById(R.id.btn_start)
        btnStart.setOnClickListener {
            if ((etName.text).isEmpty()){
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_LONG).show()
            }else{
                val intent = Intent(
                    this,
                    QuizQuestionsActivity :: class.java
                )
                intent.putExtra(Constants.USER_NAME, etName.text.toString())
                startActivity(intent)
                finish()
            }
        }
    }




}
package com.sliacen.myquizapp

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

        val buttonStart : Button = findViewById(R.id.buttonStart)
        val editName : EditText = findViewById(R.id.editTextName)
        buttonStart.setOnClickListener {
            if(editName.text.isEmpty()) {
                Toast.makeText(this,
                    "Please enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, QuizQuestionsActivity::class.java)
                intent.putExtra(Constants.USER_NAME, editName.text.toString())
                startActivity(intent) // opens new activity
                finish()    // closes current activity
            }
        }


    }
}
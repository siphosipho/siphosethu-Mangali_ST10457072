package com.example.workingbutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //write code here...
        val multiplyButton = findViewById<Button>(R.id.multiplyButton)

        val tableNumberEditText = findViewById<EditText>(R.id.tableNumberEditText)

        multiplyButton.setOnClickListener{
            //create the explicit intent
               val intent = intent(this, MultiplicationTable::class.java)
            //start the activity
                startActivity(intent)
        }
    }
}
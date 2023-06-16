package com.example.androidmaster.fistApp

import android.content.Intent
import android.nfc.Tag
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.appcompat.widget.AppCompatButton
import androidx.appcompat.widget.AppCompatEditText
import com.example.androidmaster.R

class fisrtAppActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fisrt_app)
        val btnBlack = findViewById<AppCompatButton>(R.id.btnBlack)

        val etName = findViewById<AppCompatEditText>(R.id.etName)

        btnBlack.setOnClickListener{
            val name = etName.text.toString()
            if(name.isNotEmpty()){
                val intent = Intent(this, ResultActivity::class.java)
                intent.putExtra("Extra_name",name)
                startActivity(intent)
            }
        }


    }
}
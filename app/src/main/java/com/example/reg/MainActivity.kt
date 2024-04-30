package com.example.reg


import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    lateinit var usNam:EditText
    lateinit var mAil:EditText
    lateinit var go: Button
    lateinit var sgN: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        usNam = findViewById(R.id.useNam)
        mAil = findViewById(R.id.maIl)
        go = findViewById(R.id.btnAt)
        sgN = findViewById(R.id.sGu)


        go.setOnClickListener {
        val username = usNam.text.toString()
        val Email = mAil.text.toString()

            if (username.isEmpty()||Email.isEmpty()){
                Toast.makeText(this, "please fill up",Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "thanks", Toast.LENGTH_SHORT).show()
            }
        }
        sgN.setOnClickListener {
            var intent = Intent(this@MainActivity, SignUp::class.java)
            startActivity(intent)
            finish()
        }
    }
}
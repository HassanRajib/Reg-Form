package com.example.reg

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    lateinit var name: EditText
    lateinit var mail: EditText
    lateinit var pass: EditText
    lateinit var conPa: EditText
    lateinit var btn: Button
    lateinit var jn: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        name = findViewById(R.id.nameEt)
        mail = findViewById(R.id.mailEt)
        pass = findViewById(R.id.passEt)
        conPa = findViewById(R.id.conPass)
        btn = findViewById(R.id.btnEt)
        jgkitn = findViewById(R.id.inEt)

        btn.setOnClickListener {
            val name = name.text.toString()
            val mail = mail.text.toString()
            val pass = pass.text.toString()
            val conPa = conPa.text.toString()

            if (name.isEmpty()||mail.isEmpty()||pass.isEmpty()||conPa.isEmpty()){
                Toast.makeText(this, "please fill up all the filds", Toast.LENGTH_SHORT).show()
            }else if (pass!=conPa){
                Toast.makeText(this, "password dose not match", Toast.LENGTH_SHORT).show()
            }else{
                Toast.makeText(this, "signup succesful", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
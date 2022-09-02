package com.ayushman.kardapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import org.w3c.dom.Text

class KardPage : AppCompatActivity() {

     companion object{
         const val Name_Extra="name_extra"
     }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kard_page)

        val name = intent.getStringExtra(Name_Extra)
        val textView = findViewById<TextView>(R.id.birthdayGreetings)
        textView.text = "Happy Birthday $name!"
    }
}
package com.ayushman.kardapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun BirthdayKardBana(view: View) {

        val editTxt = findViewById<EditText>(R.id.NameInput);
        val name = editTxt.text.toString();
        Toast.makeText(this,"$name Birhday card is created",Toast.LENGTH_LONG).show()

        val intent = Intent(this, KardPage::class.java)
        intent.putExtra(KardPage.Name_Extra,name)
        startActivity(intent)
    }
}
package com.vauzan.pertemuan7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText

const val THE_MESSAGE = "com.socha.praktik7.MESSAGE"

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun sendMessage(view: View) {

        val x = findViewById<EditText>(R.id.editTxtUsername)
        val message = x.text.toString()

        val intent = Intent(this, Layout2::class.java).apply {
            putExtra(THE_MESSAGE,message)

        }
        startActivity(intent)
    }
}

package com.vauzan.pertemuan7

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Spinner
import android.widget.*
import android.view.View
import kotlinx.android.synthetic.main.activity_layout2.*

const val THE_MESSAGE1 = "com.vauzan.tugas.MESSAGE1"
const val THE_MESSAGE2 = "com.vauzan.tugas.MESSAGE2"
const val THE_MESSAGE3 = "com.vauzan.tugas.MESSAGE3"
const val THE_MESSAGE4 = "com.vauzan.tugas.MESSAGE4"

class Layout2 : AppCompatActivity() {
    var jurs = arrayOf("TI", "SI", "KA","MI", "TK")

    private lateinit var spinner: Spinner
    var txt:TextView?=null
    private lateinit var jurusan: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_layout2)
        
        spinner = spin
        spinner.adapter = ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, jurs)
        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener{
            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
            override fun onItemSelected(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                jurusan = spinner.selectedItem.toString()
            }
        }
        val message = intent.getStringExtra(THE_MESSAGE)

        val textView = findViewById<TextView>(R.id.showTxtUser).apply {
            text = message
        }

    }

    fun sendMsg(view: View){
        val intent = Intent(this, Layout3::class.java).apply {
            this.putExtra(THE_MESSAGE1, editTextNm.text.toString())
            this.putExtra(THE_MESSAGE2, editTxtNim.text.toString())
            this.putExtra(THE_MESSAGE3, jurusan)
            this.putExtra(THE_MESSAGE4, editTxtUniv.text.toString())
        }
        startActivity(intent)
    }
}

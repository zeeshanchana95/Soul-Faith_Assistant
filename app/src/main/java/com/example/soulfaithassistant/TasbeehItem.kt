package com.example.soulfaithassistant

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.lang.Integer.parseInt

class TasbeehItem : AppCompatActivity() {

    lateinit var counter_txt:TextView
    var counterValue:Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh_item)

        val intent = getIntent()
        val tasbeehName = intent.getStringExtra("type")

        findViewById<TextView>(R.id.specific_tasbeeh_txt).text = tasbeehName
//        Toast.makeText(this, "$tasbeehName", Toast.LENGTH_SHORT).show()

        counter_txt = findViewById(R.id.tasbeeh_count_txt)
        counterValue = parseInt(counter_txt.text.toString())

    }

    fun increaseCounter(view: View){
        counterValue++
        counter_txt.text = counterValue.toString()
    }

    fun resetBtn(view:View){
        counterValue = 0
        counter_txt.text = counterValue.toString()
    }

    fun exitBtn(view:View){
        val intent = Intent(this, TasbeehCounter::class.java)
        startActivity(intent)
    }

}
package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity


class TasbeehCounter : AppCompatActivity() {
    val tasbeehTypes = arrayOf(
        "Allahuakbar",
        "Alhamdulillah",
        "Subhanallah",
        "Ya Hayyu Ya Qayyum",
        "Astagfirullah",
        "La IIaha Illalalah Muhammad..",
        "Darood Sharif"
    )
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tasbeeh_counter)

        //access listview widget
        var mListView = findViewById<ListView>(R.id.tasbeehlist)

        //populating listview with Adapter Class
        val myListAdapter = MyTasbeehListAdapter(this,tasbeehTypes)
        mListView.adapter = myListAdapter

        mListView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
//            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
//            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()

            val intent:Intent = Intent(this, TasbeehItem::class.java)
            intent.putExtra("type", "$itemAtPos")
            startActivity(intent)
        }
    }

    fun createNewTasbeeh(view: View){

    }
}

package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class DuaAct : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")

    private val duaName = arrayOf(
        "Dua 1",
        "Dua 2",
        "Dua 3",
        "Dua 4",
        "Dua 5",
        "Dua 6",
        "Dua 7",
        "Dua 8",
        "Dua 9",
        "Dua 10",
        "Dua 11",
        "Dua 12",
        "Dua 13",
        "Dua 14",
        "Dua 15",
        )


    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua)


        //access listview widget
        var mListView = findViewById<ListView>(R.id.duaslist)

        //populating listview with Adapter Class
        val myListAdapter = MyDuaListAdapter(this,duaName)
        mListView.adapter = myListAdapter

        //Handling event on listitem
//        var play = true
        mListView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()

        }

    }
}
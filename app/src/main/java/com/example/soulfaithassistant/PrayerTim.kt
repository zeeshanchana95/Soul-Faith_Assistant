package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.os.Bundle
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class PrayerTim : AppCompatActivity() {

    val prayerNamesArr = arrayOf<String>(
        "Fajr", "Zuhr", "Asr", "Magrib", "Isha"
    )
    val prayerTimeArr = arrayOf<String>(
        "4:45 AM","12:26 PM","4:59 PM","6:47 PM","8:08 PM"
    )
//    private val prayerNotif = arrayOf(
//        "", "", "", "", "", ""
//    )

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_prayer_tim)

        //access listview widget
        var mListView = findViewById<ListView>(R.id.prayerList)

        //populating listview with Adapter Class
        val myListAdapter = MyPrayerListAdapter(this, prayerNamesArr,prayerTimeArr)
        mListView.adapter = myListAdapter

        //Handling event on listitem
        mListView.setOnItemClickListener(){adapterView, view, position, id ->
            val itemAtPos = adapterView.getItemAtPosition(position)
            val itemIdAtPos = adapterView.getItemIdAtPosition(position)
            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()

        }
    }
}
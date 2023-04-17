package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity

class DuaAct : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")

    private val duaName = arrayOf(
        "شب قدر کی دعا",
        "روزہ رکھنے کی نیت",
        "روزہ افطار کرنے کی دعا",
        "نیند سے بیدار ہونے کی دعا",
        "سوتے وقت کی دعا",
        "مسجد میں داخل ہونے کی دعاء",
        "وضو ٔ شروع کرنے کی دع",
        "وضؤ کے بعد کی دعاء",
        "اذان کے بعد کی دعا",
        "مسجد سے نکلنے کی دعاء",
        "گھر سے نکلنے کی دعا",
        "گھر میں داخل ہونے کی دعا",
        "کھانے کے بعد کی دعا",
        "مریض کی عیادت کی دعا",
        "غصہ آنے کے وقت کی دع"
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

            val intent = Intent(this, dua_popup::class.java)
            intent.putExtra("duaName", itemAtPos.toString())
            startActivity(intent)

//            Toast.makeText(this, "Click on item at $itemAtPos its item id $itemIdAtPos", Toast.LENGTH_LONG).show()

        }

    }
}
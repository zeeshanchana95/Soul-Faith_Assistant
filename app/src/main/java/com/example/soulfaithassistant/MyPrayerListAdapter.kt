package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
class MyPrayerListAdapter(private val context: Activity,
                          private val prayN: Array<String>,
                          private val prayT: Array<String>)
    : ArrayAdapter<String>(context, R.layout.list_item_naat, prayN) {


    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item_prayer, null, true)

        //getting reference of items
        val name = rowView.findViewById(R.id.prayerNametxt) as TextView
        val time = rowView.findViewById(R.id.prayerTimetxt) as TextView

        //populating each lit_view with passing data
        name.text = prayN[position]
        time.text = prayT[position]

        return rowView
    }
}
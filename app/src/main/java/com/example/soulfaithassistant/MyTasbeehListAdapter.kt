package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
class MyTasbeehListAdapter(private val context: Activity,  private val tasbeehName: Array<String>)
    : ArrayAdapter<String>(context, R.layout.list_item_naat, tasbeehName) {

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item_tasbeeh, null, true)

        //getting reference of items in lint_view_dua item
        val name = rowView.findViewById(R.id.tasbeehNametxt) as TextView

        //populating each lit_view with passing data
        name.text = tasbeehName[position]

        return rowView
    }
}
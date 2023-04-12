package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.app.Activity
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
class MyNaatListAdapter(private val context: Activity, private val naatNo: Array<String>, private val NaatName: Array<String>,private val NaatKhawanName: Array<String>, private val naatImg: Array<Int>)
    : ArrayAdapter<String>(context, R.layout.list_item_naat, naatNo) {

    @SuppressLint("MissingInflatedId")
    override fun getView(position: Int, view: View?, parent: ViewGroup): View {
        val inflater = context.layoutInflater
        val rowView = inflater.inflate(R.layout.list_item_naat, null, true)

        //getting reference of items in lint_view item
        val no = rowView.findViewById(R.id.naatNotxt) as TextView
        val name = rowView.findViewById(R.id.naatNametxt) as TextView
        val naatKhName = rowView.findViewById(R.id.naatKhwantxt) as TextView
        val img = rowView.findViewById(R.id.naatPlayPauseBtn) as ImageView

        //populating each lit_view with passing data
        no.text = naatNo[position]
        name.text = NaatName[position]
        naatKhName.text = NaatKhawanName[position]
        img.setImageResource(naatImg[position])

        return rowView
    }
}
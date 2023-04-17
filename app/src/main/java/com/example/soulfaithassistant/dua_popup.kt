package com.example.soulfaithassistant

import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat

class dua_popup : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dua_popup)



        val img: ImageView = findViewById(R.id.duaDescriptionImg)

        val intent = getIntent()
        val title = intent.getStringExtra("duaName")
        if(title == "شب قدر کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "روزہ رکھنے کی نیت"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "روزہ رکھنے کی نیت"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "روزہ افطار کرنے کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "روزہ رکھنے کی نیت"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "نیند سے بیدار ہونے کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title ==  "سوتے وقت کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "مسجد میں داخل ہونے کی دعاء"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title ==   "اذان کے بعد کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "مسجد سے نکلنے کی دعاء"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "گھر سے نکلنے کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title == "گھر میں داخل ہونے کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title ==  "کھانے کے بعد کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title ==  "مریض کی عیادت کی دعا"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else if(title ==  "غصہ آنے کے وقت کی دع"){
            img.setImageDrawable(
                ContextCompat.getDrawable(this, R.drawable.shabe_qadar_ke_dua)
            )
        }
        else{
            Toast.makeText(this, "Dua Not Available", Toast.LENGTH_SHORT ).show()
        }


    }
}
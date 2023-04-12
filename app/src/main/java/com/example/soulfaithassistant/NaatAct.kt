package com.example.soulfaithassistant

import android.annotation.SuppressLint
import android.media.MediaPlayer
import android.os.Bundle
import android.widget.ImageView
import android.widget.ListView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class NaatAct : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")

    lateinit var mediaPlayer:MediaPlayer
    private val number = arrayOf("1. ", "2. ", "3. ", "4. ", "5. ", "6. ", "7. ", "8. ", "9. ", "10. ", "11. ", "12. ", "13. ", "14. ", "15. ")
    private val naatName = arrayOf(
        "Ye Sab Tumhara Karam Hay Aaqa",
        "Faslon ko Takaluf",
        "Qasida Burd Sharif",
        "Agar Kamli Wale",
        "Rok Leti Hai Aap",
        "Me Khud un k Dar ka Gaddaa hu",
        "Aagaey Mustafa",
        "MuAllim [The Teacher]",
        "Awal Hamd Sana-e-Ilahi",
        " Ya Mustafa",
        "Ki Parta Hoon Mein",
        "Ik Mai He Nahi Unn Per Qurban",
        "Yeh Sab Tumhara Karam Hai Aqa",
        "Jaga Jee Laganay Ki Dunyan",
        " Nabiyon Nabiyon",
    )

    private val naatKhwanName = arrayOf(
        "Khursheed Ahmad",
        "Qari Waheed Zafar",
        "Professor Abdul Rauf Rufi",
        "Muhammad Rafi",
        "Abrar ul Haq",
        "Zara Rasheed",
        "Khursheed Ahmad",
        "Sami Yusuf",
        "Marghoob Ahmad Hamdani",
        "Sami Yusuf",
        "Afzal Noshahi",
        "Hafiz Noor Sultan",
        "Mansoor Tabish",
        "Junaid Jamshed",
        "Qari Waheed Zafar"
    )

    private val naatPlayImgId = arrayOf<Int>(
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24 ,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24,
        R.drawable.baseline_play_arrow_24
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_naat)

        //access listview widget
        var mListView = findViewById<ListView>(R.id.naatlist)

        //populating listview with Adapter Class
        val myNaatListAdapter = MyNaatListAdapter(this,number,naatName, naatKhwanName,naatPlayImgId)
        mListView.adapter = myNaatListAdapter



        var check0 = true
        //Handling event on listitem
        mListView.setOnItemClickListener(){adapterView, view, position, id ->

            val btn = findViewById<ImageView>(R.id.naatPlayPauseBtn)
            if(position == 0){
                if(check0){
                    mediaPlayer = MediaPlayer.create(this, R.raw.third_ye_sab_tmhara_karam_h_aaqa)
                    mediaPlayer.start()
                    btn.setImageResource(R.drawable.baseline_pause_24)
                    check0 = false
                }else{
                    mediaPlayer.stop()
                    btn.setImageResource(R.drawable.baseline_play_arrow_24)
                    check0 = true
                }
            }

            else{
                Toast.makeText(this, "Invalid",Toast.LENGTH_SHORT).show()
            }

        }

    }

}
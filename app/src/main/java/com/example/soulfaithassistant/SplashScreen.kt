package com.example.soulfaithassistant

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import androidx.appcompat.app.AppCompatActivity


@Suppress("DEPRECATION")
class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // Hide the status bar and navigation bar
        window.decorView.systemUiVisibility = (
                View.SYSTEM_UI_FLAG_FULLSCREEN // Hide the status bar
                        or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION // Hide the navigation bar
                        or View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY // Make the UI mode immersive
                )

        setContentView(R.layout.activity_splash_screen)



        Handler().postDelayed({
            startActivity(Intent(this, MainActivity::class.java))
            finish()
        }, 3000)
    }
}
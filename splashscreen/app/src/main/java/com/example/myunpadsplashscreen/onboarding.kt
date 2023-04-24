package com.example.myunpadsplashscreen

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//import android.content.Intent
import androidx.activity.ComponentActivity

class onboarding : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Untuk Delay
        setContentView(R.layout.activity_onboarding)
    }
}
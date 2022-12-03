package com.example.yeditepem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.Window

class WelcomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_welcome_page)


        window.decorView.systemUiVisibility = View.SYSTEM.UI_FLAG_FULLSCREEN
        supportActionBar?.hide()
    }


}
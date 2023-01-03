package com.example.yeditepem.view

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.example.yeditepem.R

class PersonalPage : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = this.getSharedPreferences("com.example.yeditepem.view", Context.MODE_PRIVATE)
        setContentView(R.layout.activity_personal_page)
        findViewById<Button>(R.id.personalInformationButton).setOnClickListener(){
            onPressPersonalInformation()
        }
        findViewById<Button>(R.id.changePasswordButton).setOnClickListener(){
            onPressChangePassword()
        }
        findViewById<Button>(R.id.logoutButton).setOnClickListener(){
            onPressSignOut()
        }
    }

    fun onPressPersonalInformation(){

    }

    fun onPressChangePassword(){

    }

    fun onPressSignOut(){
        sharedPreferences.edit().putString("studentId","").apply()
        val intent = Intent(this, LoginPage::class.java)
        this.startActivity(intent)
    }
}
package com.example.yeditepem.view

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.navigation.findNavController
import com.example.yeditepem.R
import com.google.android.material.bottomnavigation.BottomNavigationView

class PersonalPage : AppCompatActivity() {
    lateinit var sharedPreferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = this.getSharedPreferences("com.example.yeditepem.view", Context.MODE_PRIVATE)
        setContentView(R.layout.activity_personal_page)
        var bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.faculty -> {
                    loadFacultyActivity()
                    true
                }
                R.id.mainPage -> {
                    loadMainFragment()
                    true
                }
                R.id.personalPage -> {
                    loadPersonalActivity()
                    true
                }
                else -> {
                    print("A problem occurred!")
                    true
                }
            }
        }
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

    fun loadFacultyActivity(){
        startActivity(Intent(this, FacultyPage::class.java))
    }

    fun loadMainFragment(){
        startActivity(Intent(this, HomePage::class.java))
    }

    fun loadPersonalActivity(){
        startActivity(Intent(this, PersonalPage::class.java))

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
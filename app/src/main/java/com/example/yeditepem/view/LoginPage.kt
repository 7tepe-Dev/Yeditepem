package com.example.yeditepem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.yeditepem.R
import com.example.yeditepem.services.MealService
import com.example.yeditepem.viewmodel.*

class LoginPage : AppCompatActivity() {
    //lateinit var loginviewModel:LoginViewModel
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login_page)
        //loginviewModel = LoginViewModel()
        /*var studentViewModel = StudentViewModel()
        studentViewModel.getStudentById(this,"20192905001")*/


    }

    fun handleLogin(view:View){
        val userName:TextView = findViewById(R.id.usernameTextBox)
        val password: TextView = findViewById(R.id.passwordTextBox)
        val loginviewModel = LoginViewModel()
        loginviewModel.getUserById(this,userName.text.toString(), password.text.toString())
    }

}
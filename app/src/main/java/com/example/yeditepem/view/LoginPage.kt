package com.example.yeditepem.view

import android.content.Context
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import com.example.yeditepem.R
import com.example.yeditepem.services.MealService
import com.example.yeditepem.viewmodel.*

class LoginPage : AppCompatActivity() {
    lateinit var studentViewModel:StudentViewModel
    lateinit var sharedPreferences : SharedPreferences
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        sharedPreferences = this.getSharedPreferences("com.example.yeditepem.view", Context.MODE_PRIVATE)
        handleStudentLogin()
}


    fun handleStudentLogin(){

        if(sharedPreferences.getString("studentId","")!=null && sharedPreferences.getString("studentId","")!=""){
            println(sharedPreferences.getString("studentId",""))
            studentViewModel = StudentViewModel()
            studentViewModel.getStudentById(this,sharedPreferences.getString("studentId","")!!,false)
        }
        else{
            setContentView(R.layout.activity_login_page)
        }

    }

    fun handleLogin(view:View){
        val userName:TextView = findViewById(R.id.usernameTextBox)
        val password: TextView = findViewById(R.id.passwordTextBox)
        val rememberMe : CheckBox = findViewById(R.id.rememberMeCheckBox)
        val loginviewModel = LoginViewModel()
        loginviewModel.getUserById(this,userName.text.toString(), password.text.toString(),rememberMe.isChecked)
    }

}
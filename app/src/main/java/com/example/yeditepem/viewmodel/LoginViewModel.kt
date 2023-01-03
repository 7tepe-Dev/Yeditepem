package com.example.yeditepem.viewmodel

import android.content.Context
import android.content.Intent
import android.view.View
import android.widget.CheckBox
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yeditepem.R
import com.example.yeditepem.adapters.GeneralInformationAdapter
import com.example.yeditepem.model.Student
import com.example.yeditepem.services.ApiClient
import com.example.yeditepem.services.LoginService
import com.example.yeditepem.services.StudentService
import com.example.yeditepem.view.HomePage
import com.example.yeditepem.view.LoginPage
import com.google.gson.annotations.SerializedName
import kotlinx.coroutines.launch

class Login(
    @SerializedName("isOK")
    var isOk:String)
class LoginViewModel: ViewModel() {
    lateinit var loginService: LoginService
    var loginObject : MutableLiveData<Login> = MutableLiveData()
    private fun _getUserById(id: String,password:String) {
        loginService = ApiClient.getClient().create(LoginService::class.java)
        viewModelScope.launch {

            loginObject.value= loginService.getUserByID(id,password)
            //println(student.isOk)
        }
    }

    fun getUserById(activity: AppCompatActivity, id: String,password: String,saveUser: Boolean){
        _getUserById(id,password)

        loginObject.observe(activity, Observer{
            if (loginObject.value != null && loginObject.value!!.isOk == "true"){
                val studentVM = StudentViewModel()
                studentVM.getStudentById(activity,id,saveUser)
                //LOAD NEXT PAGE
                /*val intent = Intent(activity, HomePage::class.java)
                activity.startActivity(intent)*/

            }
            else if(loginObject.value != null && (loginObject.value!!.isOk != "true")){
                println("Your username or pssword is wrong!")
                activity.findViewById<TextView>(R.id.usernameTextBox).text = ""
                activity.findViewById<TextView>(R.id.passwordTextBox).text = ""
                activity.findViewById<CheckBox>(R.id.rememberMeCheckBox).isChecked = false
            }
        })

    }
}
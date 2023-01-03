package com.example.yeditepem.viewmodel

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.yeditepem.model.Student
import com.example.yeditepem.services.ApiClient
import com.example.yeditepem.services.StudentService
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope
import com.example.yeditepem.view.HomePage

class StudentViewModel(): ViewModel() {
    lateinit var studentService: StudentService
    var studentList : MutableLiveData<List<Student>> = MutableLiveData()
    //var student : MutableLiveData<Student> = MutableLiveData()

    companion object {
        val currentStudent: MutableLiveData<Student> = MutableLiveData()
    }
    private fun _getStudents() {
        studentService = ApiClient.getClient().create(StudentService::class.java)
        viewModelScope.launch {
            studentList.value= studentService.getStudents()
        }
    }

    private fun _getStudentById(id: String) {
        studentService = ApiClient.getClient().create(StudentService::class.java)

        viewModelScope.launch {
            currentStudent.value= studentService.getStudentById(id)
        }
    }

    fun getStudents(activity: AppCompatActivity){
        _getStudents()
        studentList.observe(activity, Observer{
            if (studentList.value != null){
                //testAdapter(studentList.value!!)
            }
        })
    }

    fun getStudentById(activity: AppCompatActivity, id: String,saveUser: Boolean){
        _getStudentById(id)
        currentStudent.observe(activity, Observer{
            if (currentStudent.value != null){
                /*
                if(saveUser){
                    val sharedPreferences = activity.getSharedPreferences("com.example.yeditepem.view", Context.MODE_PRIVATE)
                    sharedPreferences.edit().putString("studentId",id).apply()
                    println("New preference is added!")
                }

                val intent = Intent(activity, HomePage::class.java)
                activity.startActivity(intent)
                //testAdapter(activity, student.value!!)
                //println(student.value!!.generalInformation?.advisor)
                //GeneralInformationAdapter(activity, currentStudent.value!!.generalInformation!!)
                */

                println(currentStudent.value!!.applications[1].applicationHour)
            }
        })
    }

}
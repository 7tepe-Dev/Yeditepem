package com.example.yeditepem.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import com.example.yeditepem.model.Student
import com.example.yeditepem.model.testStudent
import com.example.yeditepem.services.ApiClient
import com.example.yeditepem.services.StudentService
import com.example.yeditepem.view.MainActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlinx.coroutines.launch
import androidx.lifecycle.viewModelScope
import com.example.yeditepem.services.testAdapter

class StudentViewModel(): ViewModel() {
    lateinit var studentService: StudentService
    var studentList : MutableLiveData<List<Student>> = MutableLiveData()
    var student : MutableLiveData<Student> = MutableLiveData()

    private fun _getStudents() {
        studentService = ApiClient.getClient().create(StudentService::class.java)
        viewModelScope.launch {
            studentList.value= studentService.getStudents()
        }
    }

    private fun _getStudentById(id: String) {
        studentService = ApiClient.getClient().create(StudentService::class.java)
        viewModelScope.launch {
            student.value= studentService.getStudentById(id)
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

    fun getStudentById(activity: AppCompatActivity, id: String){
        _getStudentById(id)
        student.observe(activity, Observer{
            if (student.value != null){
                //testAdapter(activity, student.value!!)
                println(student.value!!.generalInformation?.advisor)
            }
        })
    }
}
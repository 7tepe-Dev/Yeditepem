package com.example.yeditepem.viewmodel

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.MutableLiveData
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

class StudentViewModel: ViewModel() {
    lateinit var studentService: StudentService
    //lateinit var studentList: MutableList<testStudent>
    var studentList : MutableLiveData<List<testStudent>> = MutableLiveData()


/*
    suspend fun getStudents(): MutableList<testStudent> {
        studentService = ApiClient.getClient().create(StudentService::class.java)
        var students = studentService.getStudents()

        students.enqueue(object : Callback<List<testStudent>> {
            override fun onFailure(call: Call<List<testStudent>>, t: Throwable) {
                Log.d("Ow shit", "Here we go again")
            }
            override fun onResponse(call: Call<List<testStudent>>, response: Response<List<testStudent>>) {
                if (response.isSuccessful) {
                    studentList = (response.body() as MutableList<testStudent>?)!!
                }
            }
        })

        return studentList
    }
*/
    fun getStudents() {
        studentService = ApiClient.getClient().create(StudentService::class.java)
        viewModelScope.launch {
            studentList.value= studentService.getStudents()
        }

    }
}
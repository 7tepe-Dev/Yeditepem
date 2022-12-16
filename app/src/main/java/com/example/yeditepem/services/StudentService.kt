package com.example.yeditepem.services

import com.example.yeditepem.model.Student
import com.example.yeditepem.model.testStudent
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface StudentService {
    @GET("students")
    suspend fun getStudents(): List<testStudent>

    @GET("student")
    suspend fun getStudentById(@Query("id") id: String): testStudent

}
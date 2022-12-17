package com.example.yeditepem.services

import com.example.yeditepem.model.Student
import com.example.yeditepem.viewmodel.Login
import retrofit2.http.GET
import retrofit2.http.Query

interface LoginService {

    @GET("authentication")
    suspend fun getUserByID(@Query("id") id: String,@Query("password") password: String): Login
}
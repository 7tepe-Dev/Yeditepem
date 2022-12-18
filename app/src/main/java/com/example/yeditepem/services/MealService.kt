package com.example.yeditepem.services

import com.example.yeditepem.model.Meal
import com.example.yeditepem.model.Student
import retrofit2.http.GET
import retrofit2.http.Query

interface MealService {
    @GET("meal")
    suspend fun getMeals(): List<Meal>


}
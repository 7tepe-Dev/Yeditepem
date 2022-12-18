package com.example.yeditepem.services

import com.example.yeditepem.model.Calendar
import com.example.yeditepem.model.Meal
import retrofit2.http.GET

interface CalendarService {
    @GET("calendar")
    suspend fun getCalendar(): List<Calendar>


}
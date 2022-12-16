package com.example.yeditepem.services

import com.example.yeditepem.model.Announcement
import com.example.yeditepem.model.testStudent
import retrofit2.http.GET

interface AnnouncementService {
    @GET("announcements")
    suspend fun getAnnouncements(): List<Announcement>
}
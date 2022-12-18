package com.example.yeditepem.viewmodel

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yeditepem.adapters.AnnouncementAdapter
import com.example.yeditepem.adapters.CalendarAdapter
import com.example.yeditepem.model.Announcement
import com.example.yeditepem.model.Calendar
import com.example.yeditepem.services.AnnouncementService
import com.example.yeditepem.services.ApiClient
import com.example.yeditepem.services.CalendarService
import kotlinx.coroutines.launch

class CalendarViewModel: ViewModel() {
    lateinit var calendarService: CalendarService
    var calendarList: MutableLiveData<List<Calendar>> = MutableLiveData()

    private fun _getAnnouncements() {
        calendarService = ApiClient.getClient().create(CalendarService::class.java)
        viewModelScope.launch {
            calendarList.value = calendarService.getCalendar()
        }
    }

    fun getCalendar(activity: AppCompatActivity) {
        _getAnnouncements()
        calendarList.observe(activity, Observer {
            if (calendarList.value != null) {
                CalendarAdapter(activity, calendarList.value!!)
            }
        })
    }
}
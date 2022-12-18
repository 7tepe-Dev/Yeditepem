package com.example.yeditepem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import com.example.yeditepem.R
import com.example.yeditepem.viewmodel.AnnouncementViewModel
import com.example.yeditepem.viewmodel.CalendarViewModel
import com.example.yeditepem.viewmodel.MealViewModel
import com.example.yeditepem.viewmodel.StudentViewModel

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        println(StudentViewModel.currentStudent.value?.generalInformation?.advisor)

        //var announcementViewModel = AnnouncementViewModel()
        //announcementViewModel.getAnnouncements(this)

        //var mealViewModel = MealViewModel()
        //mealViewModel.getMeals(this)

        var calendarViewModel = CalendarViewModel()
        calendarViewModel.getCalendar(this)

    }
}

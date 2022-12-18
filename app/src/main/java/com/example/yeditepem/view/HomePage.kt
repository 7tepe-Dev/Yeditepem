package com.example.yeditepem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.view.get
import com.example.yeditepem.R
import com.example.yeditepem.viewmodel.AnnouncementViewModel
import com.example.yeditepem.viewmodel.CalendarViewModel
import com.example.yeditepem.viewmodel.MealViewModel
import com.example.yeditepem.viewmodel.StudentViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var bottomNav = findViewById(R.id.secondNavBar) as BottomNavigationView
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.yemekLogo -> {
                    displayMeal()
                    true
                }
                R.id.takvimLogo -> {
                    displayCalendar()
                    true
                }
                R.id.okulDuyuru -> {
                    displayAnnouncements()
                    true
                }
                else -> {
                    print("Hellö")
                    true
                }
            }
        }
    }

    fun displayAnnouncements(){
        var announcementViewModel = AnnouncementViewModel()
        announcementViewModel.getAnnouncements(this)
    }

    fun displayMeal(){
        var mealViewModel = MealViewModel()
        mealViewModel.getMeals(this)
    }

    fun displayCalendar(){
        var calendarViewModel = CalendarViewModel()
        calendarViewModel.getCalendar(this)
    }
}

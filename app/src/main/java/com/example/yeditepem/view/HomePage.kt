package com.example.yeditepem.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import androidx.core.view.get
import androidx.navigation.findNavController
import com.example.yeditepem.R
import com.example.yeditepem.viewmodel.AnnouncementViewModel
import com.example.yeditepem.viewmodel.CalendarViewModel
import com.example.yeditepem.viewmodel.MealViewModel
import com.example.yeditepem.viewmodel.StudentViewModel
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.tabs.TabLayout

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.faculty -> {
                    loadFacultyActivity()
                    true
                }
                R.id.mainPage -> {
                    loadMainFragment()
                    true
                }
                R.id.personalPage -> {
                    loadPersonalActivity()
                    true
                }
                else -> {
                    print("Hellö")
                    true
                }
            }
        }

    }
    fun loadFacultyActivity(){
        startActivity(Intent(this, FacultyPage::class.java))
    }

    fun loadMainFragment(){
        println("Main fragment is loaded!")
        this.findNavController(R.id.fragmentContainerView).navigate(R.id.mainFragment)

    }

    fun loadPersonalActivity(){
        startActivity(Intent(this, PersonalPage::class.java))

    }
    /*fun displayAnnouncements(){
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
    }*/
}

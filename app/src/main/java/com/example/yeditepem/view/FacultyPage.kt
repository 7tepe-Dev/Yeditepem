package com.example.yeditepem.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.findNavController
import com.example.yeditepem.R
import com.google.android.material.appbar.MaterialToolbar
import com.google.android.material.bottomnavigation.BottomNavigationView

class FacultyPage : AppCompatActivity() {

    lateinit var materialToolbar : MaterialToolbar
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_faculty_page)
        materialToolbar = findViewById(R.id.topAppBar)
        var bottomNav = findViewById<BottomNavigationView>(R.id.bottom_navigation)
        bottomNav.setOnItemSelectedListener {
            when (it.itemId) {
                R.id.generalInfoHomeButton -> {
                    loadGeneralInformationFragment()
                    true
                }
                R.id.generalInfoScheduleButton -> {
                    loadScheduleFragment()
                    true
                }
                R.id.generalInfoLessonsButton -> {
                    loadLessonsFragment()
                    true
                }
                R.id.generalInfoExamsButton -> {
                    loadExamsFragment()
                    true
                }
                R.id.generalInfoApplicationsButton -> {
                    loadApplicationsFragment()
                    true
                }
                else -> {
                    print("A problem occurred!")
                    true
                }
            }
        }


    }

    fun loadGeneralInformationFragment(){
        materialToolbar.title = "General"
        this.findNavController(R.id.fragmentContainerView).navigate(R.id.generalInformationFragment)
    }

    fun loadScheduleFragment(){
        materialToolbar.title = "Schedule"
        this.findNavController(R.id.fragmentContainerView).navigate(R.id.scheduleFragment)
    }

    fun loadLessonsFragment(){
        materialToolbar.title = "Courses"
        this.findNavController(R.id.fragmentContainerView).navigate(R.id.lessonsFragment)
    }

    fun loadExamsFragment(){
        materialToolbar.title = "Exams"
        this.findNavController(R.id.fragmentContainerView).navigate(R.id.examsFragment)
    }

    fun loadApplicationsFragment(){
        materialToolbar.title = "Applications"
        this.findNavController(R.id.fragmentContainerView).navigate(R.id.applicationsFragment)
    }

}
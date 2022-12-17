package com.example.yeditepem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yeditepem.R
import com.example.yeditepem.viewmodel.AnnouncementViewModel
import com.example.yeditepem.viewmodel.StudentViewModel

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)
        println(StudentViewModel.currentStudent.value?.generalInformation?.advisor)
        /*var announcementViewModel= AnnouncementViewModel()
        announcementViewModel.getAnnouncements(this)*/
    }
}

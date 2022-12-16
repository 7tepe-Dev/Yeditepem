package com.example.yeditepem

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.example.yeditepem.viewmodel.AnnouncementViewModel

class HomePage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home_page)

        var announcementViewModel= AnnouncementViewModel()
        announcementViewModel.getAnnouncements(this)
    }
}

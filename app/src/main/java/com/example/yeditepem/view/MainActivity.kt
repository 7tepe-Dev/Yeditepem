package com.example.yeditepem.view

import android.annotation.SuppressLint
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.yeditepem.R
import com.example.yeditepem.viewmodel.AnnouncementViewModel
import com.example.yeditepem.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var announcementViewModel= AnnouncementViewModel()
        announcementViewModel.getAnnouncements(this)
    }

}
package com.example.yeditepem.viewmodel

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yeditepem.adapters.AnnouncementAdapter
import com.example.yeditepem.model.Announcement
import com.example.yeditepem.services.AnnouncementService
import com.example.yeditepem.services.ApiClient
import kotlinx.coroutines.launch

class AnnouncementViewModel(): ViewModel() {
    lateinit var  announcementService: AnnouncementService
    var announcementList : MutableLiveData<List<Announcement>> = MutableLiveData()

    private fun _getAnnouncements() {
        announcementService = ApiClient.getClient().create(AnnouncementService::class.java)
        viewModelScope.launch {
            announcementList.value= announcementService.getAnnouncements()
        }
    }

    fun getAnnouncements(activity: AppCompatActivity){
        _getAnnouncements()
        announcementList.observe(activity, Observer{
            if (announcementList.value != null){
                AnnouncementAdapter(activity, announcementList.value!!)
            }
        })
    }

}
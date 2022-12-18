package com.example.yeditepem.adapters

import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.ImageButton
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.yeditepem.R
import com.example.yeditepem.model.Announcement

class AnnouncementAdapter(activity: AppCompatActivity, myAnnouncements: List<Announcement>) {

    private var activity = activity
    private var myAnnouncements = myAnnouncements

    init {

        when(activity.componentName.shortClassName){
            ".view.HomePage" -> HomePage()
        }

    }

    fun HomePage(){
        var myLayout = activity.findViewById<LinearLayout>(R.id.myLayout)
        myLayout.removeAllViews()
        for (announcement in myAnnouncements){
            var myButton = Button(activity);
            myButton.text = "DUYURU " + announcement.time + "\n" + announcement.content
            myButton.setOnClickListener{
                val openURL = Intent(Intent.ACTION_VIEW)
                openURL.data = Uri.parse(announcement.url)
                activity.startActivity(openURL)
            }
            myLayout.addView(myButton)
        }


    }
}
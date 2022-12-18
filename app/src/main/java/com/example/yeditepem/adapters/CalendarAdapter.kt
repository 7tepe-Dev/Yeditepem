package com.example.yeditepem.adapters

import android.content.Intent
import android.net.Uri
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity
import com.example.yeditepem.R
import com.example.yeditepem.model.Announcement
import com.example.yeditepem.model.Calendar

class CalendarAdapter (activity: AppCompatActivity, myCalendars: List<Calendar>) {

    private var activity = activity
    private var myCalendars = myCalendars

    init {

        when(activity.componentName.shortClassName){
            ".view.HomePage" -> HomePage()
        }

    }

    fun HomePage(){
        var myLayout = activity.findViewById<LinearLayout>(R.id.myLayout)

        for (calendar in myCalendars){
            var myButton = Button(activity);
            myButton.text = calendar.content
            myLayout.addView(myButton)
        }
    }
}
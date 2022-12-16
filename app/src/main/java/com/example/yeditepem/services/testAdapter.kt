package com.example.yeditepem.services

import android.util.Log
import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.yeditepem.R
import com.example.yeditepem.model.Announcement
import org.json.JSONObject

class testAdapter(activity: AppCompatActivity, myAnnouncements: List<Announcement>) {

    init {
        // acitivity adını kontrol ederken activitilere özel oluşturduğumuz metodları
        // switch case gibi bir yapıyla çağırabiliriz
        //Log.d("TEST", context.componentName.shortClassName)

        var myLayout: LinearLayout? = activity.findViewById<LinearLayout>(R.id.myLayout)
        for (announcement in myAnnouncements){
            var myButton = Button(activity);
            myButton.text = "DUYURU " + announcement.time + "\n" + announcement.content
            myLayout?.addView(myButton)
        }

    }


}
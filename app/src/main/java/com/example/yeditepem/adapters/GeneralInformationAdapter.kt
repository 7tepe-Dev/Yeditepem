package com.example.yeditepem.adapters

import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.yeditepem.R
import com.example.yeditepem.model.Announcement
import com.example.yeditepem.model.MyGeneralInformation

class GeneralInformationAdapter(var activity: AppCompatActivity, var myGeneralInformation: MyGeneralInformation):IAdapter {

   /* init {
        // acitivity adını kontrol ederken activitilere özel oluşturduğumuz metodları
        // switch case gibi bir yapıyla çağırabiliriz
        //Log.d("TEST", context.componentName.shortClassName)
        displayData()


    }
    override fun displayData() {

        var myLayout: LinearLayout? = activity.findViewById<LinearLayout>(R.id.myLayout)

        var myButton = Button(activity);
        myButton.text = myGeneralInformation.startDate
        myLayout?.addView(myButton)
        /*for (announcement in myAnnouncements){
            var myButton = Button(activity);
            myButton.text = "DUYURU " + announcement.time + "\n" + announcement.content
            myLayout?.addView(myButton)
        }*/
    }*/


}
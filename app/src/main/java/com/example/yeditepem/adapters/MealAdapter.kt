package com.example.yeditepem.adapters

import android.widget.Button
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import com.example.yeditepem.R
import com.example.yeditepem.model.Announcement
import com.example.yeditepem.model.Meal

class MealAdapter(activity: AppCompatActivity, myMeals: List<Meal>) {

    private var activity = activity
    private var myMeals= myMeals

    init {

        when(activity.componentName.shortClassName){
            ".view.HomePage" -> HomePage()
        }

    }

    fun HomePage(){
        var myLayout = activity.findViewById<LinearLayout>(R.id.myLayout)
        myLayout.removeAllViews()
        for (meal in myMeals){
            var myButton = Button(activity);
            myButton.text = meal.foodName
            myLayout.addView(myButton)
        }


    }
}
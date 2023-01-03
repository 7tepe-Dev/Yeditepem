package com.example.yeditepem

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.yeditepem.model.Lesson
import com.example.yeditepem.viewmodel.StudentViewModel


class ScheduleFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_schedule, container, false)
        createScheduleView(layout)
        return layout
    }

    @SuppressLint("MissingInflatedId")
    fun createScheduleView(layout:View){
        val parentLayout = layout.findViewById<LinearLayout>(R.id.scheduleParentLinearLayout)

        val lessons = StudentViewModel.currentStudent.value?.lessons

        val days = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        for(day in days){
            val daysLessons = ArrayList<Lesson>()
            for(lesson in lessons!!){
                if(lesson.lessonDay==day){
                    daysLessons.add(lesson)
                }
            }
            if(daysLessons.size>0){
                var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.schedule_day_list_view, null,false)
                createdThing.findViewById<TextView>(R.id.courseDay).text = day
                parentLayout.addView(createdThing)
            }
            //sort and show
            for(lesson in daysLessons){
                var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.schedule_course_list_view, null,false)
                createdThing.findViewById<TextView>(R.id.lessonHour).text = lesson.lessonTimeRange
                createdThing.findViewById<TextView>(R.id.lessonCodeAndSection).text = lesson.lessonCode + "." + lesson.lessonSection
                createdThing.findViewById<TextView>(R.id.lessonLocation).text = lesson.lessonLocation
                parentLayout.addView(createdThing)
            }

        }

    }
}
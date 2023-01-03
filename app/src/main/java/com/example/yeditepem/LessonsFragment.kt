package com.example.yeditepem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.yeditepem.viewmodel.StudentViewModel


class LessonsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_lessons, container, false)
        createLessonsView(layout)
        return layout
    }

    fun createLessonsView(layout:View){
        val parentLayout = layout.findViewById<LinearLayout>(R.id.lessonsLinearLayout)

        val currentLessons = StudentViewModel.currentStudent.value?.lessons

        for(lesson in currentLessons!!){
            var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.courses_list_view, null,false)
            createdThing.findViewById<TextView>(R.id.courseCodeText).text = lesson.lessonCode + "." + lesson.lessonSection
            createdThing.findViewById<TextView>(R.id.courseCreditInt).text =lesson.lessonCredit
            createdThing.findViewById<TextView>(R.id.courseNameText).text =lesson.lessonName
            parentLayout.addView(createdThing)
        }

    }
}
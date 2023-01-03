package com.example.yeditepem

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import com.example.yeditepem.viewmodel.StudentViewModel


class GeneralInformationFragment : Fragment() {

    val generalInformationTexts = arrayOf("Status","Student No","Advisor","CGPA","Credits","ECTS",
    "Financial Approval","Scholarship","Curriculum","Placement Type","Entry Type","Start Date")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_general_information, container, false)
        createViewsTemp(layout)
        return layout
    }

    @SuppressLint("MissingInflatedId")
    fun createViewsTemp(layout:View){
        val desiredLayout = layout.findViewById<LinearLayout>(R.id.myLayout)

        for (currentText in generalInformationTexts){
            var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
            createdThing.findViewById<TextView>(R.id.statusText).text = currentText
            createdThing.findViewById<TextView>(R.id.statusValText).text = StudentViewModel.currentStudent.value?.generalInformation?.startDate
            desiredLayout.addView(createdThing)
        }

    }

}
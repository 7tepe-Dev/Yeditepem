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


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_general_information, container, false)
        createGeneralInformationView(layout)
        return layout
    }

    @SuppressLint("MissingInflatedId")
    fun createGeneralInformationView(layout:View){
        val desiredLayout = layout.findViewById<LinearLayout>(R.id.myLayout)

        val currentGeneralInformation = StudentViewModel.currentStudent.value?.generalInformation

        var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Status"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation!!.statusOfStudent
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Student No"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.studentID
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Advisor"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.advisor
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "CGPA"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.grade.toString()
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Credits"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.creditsCompleted.toString() + "/" + currentGeneralInformation.creditsTaken.toString()
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "ECTS"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.ects.toString()
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Financial Approval"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.financialApproval
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Scholarship"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.scholarShip
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Curriculum"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.departmentsCurriculum
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Placement Type"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.placementType
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Entry Type"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.entryType
        desiredLayout.addView(createdThing)

        createdThing = LayoutInflater.from(layout.context).inflate(R.layout.general_information_list_view, null,false)
        createdThing.findViewById<TextView>(R.id.generalInformationPlaceHolderText).text = "Start Date"
        createdThing.findViewById<TextView>(R.id.generalInformationValText).text = currentGeneralInformation.startDate
        desiredLayout.addView(createdThing)
     }

}
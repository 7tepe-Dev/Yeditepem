package com.example.yeditepem

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import com.example.yeditepem.viewmodel.StudentViewModel


class ApplicationsFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_applications, container, false)
        createApplicationsView(layout)
        return layout
    }

    @SuppressLint("MissingInflatedId")
    fun createApplicationsView(layout:View){
        val parentLayout = layout.findViewById<LinearLayout>(R.id.applicationsListParentLayout)
        val currentApplications = StudentViewModel.currentStudent.value?.applications
        for(application in currentApplications!!){
            var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.applications_list_view, null,false)
            createdThing.findViewById<TextView>(R.id.applicationDate).text = application.applicationDate
            createdThing.findViewById<TextView>(R.id.applicationHour).text = application.applicationHour
            createdThing.findViewById<ImageView>(R.id.applicationStatus).setImageResource(R.drawable.basvuru_onaylandi_vector)
            parentLayout.addView(createdThing)
        }

    }


}
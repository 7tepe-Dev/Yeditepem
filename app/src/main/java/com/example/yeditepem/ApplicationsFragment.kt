package com.example.yeditepem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


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

    fun createApplicationsView(layout:View){
        val parentLayout = layout.findViewById<LinearLayout>(R.id.applicationsListParentLayout)
        repeat(20){
            var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.applications_list_view, null,false)
            parentLayout.addView(createdThing)
        }
    }


}
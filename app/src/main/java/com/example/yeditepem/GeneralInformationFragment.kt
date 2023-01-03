package com.example.yeditepem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout


class GeneralInformationFragment : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val layout = inflater.inflate(R.layout.fragment_general_information, container, false)
        //createViewsTemp(layout)
        return layout
    }
/*Dinamik deneme
    fun createViewsTemp(layout:View){
        val desiredLayout = layout.findViewById<LinearLayout>(R.id.myLayout)


        repeat(50){
            var createdThing = LayoutInflater.from(layout.context).inflate(R.layout.activity_general_information_list_view, null,false)

            desiredLayout.addView(createdThing)
        }
    }
*/
}
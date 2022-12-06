package com.example.yeditepem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.yeditepem.R
import com.example.yeditepem.model.testStudent
import com.example.yeditepem.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var y = findViewById<TextView>(R.id.dbButton) as TextView

        var studentViewModel = StudentViewModel()
        studentViewModel.getStudents()

        studentViewModel.studentList.observe(this, Observer{
            if (studentViewModel.studentList.value != null){
                y.text = studentViewModel.studentList.value!![0].toString()
            }
        })

    }

}
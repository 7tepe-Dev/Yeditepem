package com.example.yeditepem.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.util.Log
import android.widget.TextView
import androidx.lifecycle.Observer
import com.example.yeditepem.R
import com.example.yeditepem.model.testStudent
import com.example.yeditepem.viewmodel.StudentViewModel

class MainActivity : AppCompatActivity() {

    var runnable:Runnable = Runnable{}
    var handler = Handler()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        handler = Handler()
        var y = findViewById<TextView>(R.id.test) as TextView
        //val tempstatus = MutableLiveData<String>()

        // The external immutable LiveData for the request status




        var studentViewModel = StudentViewModel()
        studentViewModel.getStudents()

        studentViewModel.studentList.observe(this, Observer{
            if (studentViewModel.studentList.value != null){
                y.text = studentViewModel.studentList.value!![0].toString()

                //println(studentViewModel.studentList.value)
            }
        })

        runnable = Runnable {
            handler.postDelayed(runnable,10)
            if(studentViewModel.studentList.value == null){
                println("Hala Null")
            }
            else{
                println("Artık null degil")
                println(studentViewModel.studentList.value!![0].id)
                handler.removeCallbacks(runnable)
            }
        }
        handler.post(runnable)
        //handler.removeCallbacks(runnable)

    }

}
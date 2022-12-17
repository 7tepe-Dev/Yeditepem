package com.example.yeditepem.model

import com.google.gson.annotations.SerializedName

class Student(override val userName: String,
              override val password: String,
              @SerializedName("generalInfo")
              val generalInformation: MyGeneralInformation?,
              /*val lessons:MyLessons?,
              val exams:MyExams?,
              val applications: MyApplications?*/

              /*val lessons: MyLessons?,
              val exams: MyExams?,
              val applications: MyApplications?,*/

              /*val department: String,
              val statusOfStudent: String,
              val studentID: String,
              val advisor: String,
              val grade: Float,
              val creditsCompleted: Int,
              val creditsTaken: Int,
              val ects: Int,
              val financialApproval: String,
              val scholarShip: String,
              val departmentsCurriculum: String,
              val placementType: String,
              val entryType: String,
              val startDate: String,
              val allLessons: Array<Lesson>,
              val currentLessons: Array<Lesson>,
              val allExams: Array<Exam>,
              val currentExams: Array<Exam>,*/) : User {

}
package com.example.yeditepem.model

import java.util.Date

data class Exam(
    var lessonName: String,
    var lessonCode: String,
    var professorName: String,
    var lessonGrade: Float,
    var lessonCredit: Int,
    var lessonLetterGrade: String,
    var examDate: Date
)
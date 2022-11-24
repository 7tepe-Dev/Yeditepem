package com.example.yeditepem.model

data class Lesson(
    var lessonName: String,
    var lessonCode: String,
    var professorName: String,
    var lessonLocation: String,
    var lessonTime: String,
    var lessonCredit: Int,
    var lessonTerm: String
)
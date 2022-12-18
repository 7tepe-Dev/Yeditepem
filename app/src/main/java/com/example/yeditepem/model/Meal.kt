package com.example.yeditepem.model

import com.google.gson.annotations.SerializedName
import java.util.Date

data class Meal(
    @SerializedName("SK")
    var currentDate: String,
    @SerializedName("foodName")
    var foodName: String
)
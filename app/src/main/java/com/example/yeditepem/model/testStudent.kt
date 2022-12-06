package com.example.yeditepem.model

import com.google.gson.annotations.SerializedName
import org.json.JSONObject

data class testStudent(
    @SerializedName("Id")
    var id: String,
    @SerializedName("UserType")
    var userType: String) {

}
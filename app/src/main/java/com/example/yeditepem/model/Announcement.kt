package com.example.yeditepem.model

import com.google.gson.annotations.SerializedName

data class Announcement(
    @SerializedName("SK")
    var id: String,
    @SerializedName("time")
    var time: String,
    @SerializedName("content")
    var content: String
    )
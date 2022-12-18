package com.example.yeditepem.model

import com.google.gson.annotations.SerializedName

data class Calendar(
    @SerializedName("SK")
    var id: String,
    @SerializedName("content")
    var content: String,
    @SerializedName("time")
    var time: String
    )

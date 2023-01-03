package com.example.yeditepem.model

import java.util.Date

data class Message(
    val messageId: String,
    val senderName: String,
    val receiverId: String,
    val content: String,
    val time: String)
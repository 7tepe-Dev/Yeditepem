package com.example.yeditepem.model

import java.util.Date

class Message(
    _id: String,
    _senderId: String,
    _receiverId: String,
    _content: String,
    _time: Date) {

    private var id: String = _id
        get() = field
        set(value){field = value}

    private var senderId: String = _senderId
        get() = field
        set(value){field = value}

    private var receiverId: String = _receiverId
        get() = field
        set(value){field = value}

    private var content: String = _content
        get() = field
        set(value){field = value}

    private var time: Date = _time
        get() = field
        set(value){field = value}

}
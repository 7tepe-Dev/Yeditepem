package com.example.yeditepem.services

import java.net.HttpURLConnection
import java.net.URL


object DynamoDBService {

    val apiURL: String = "https://800iolm50e.execute-api.us-east-1.amazonaws.com/test"

    fun getStudents(): String {
        val requestURL: String = "$apiURL/students"
        val url = URL(requestURL)

        with(url.openConnection() as HttpURLConnection) {
            requestMethod = "GET"  // optional default is GET

            println("\nSent 'GET' request to URL : $url; Response Code : $responseCode")

            /*
            inputStream.bufferedReader().use {
                it.lines().forEach { line ->
                    println(line)
                }
            }
             */
        }

        return "getUsers()"
    }

    fun getStudentById(): String {
        return "getUsersId()"
    }

    fun getStaff(): String {
        return "getStaff()"
    }

    fun getStaffById(): String {
        return "getStaffById()"
    }

    fun sendGet() {

    }


}
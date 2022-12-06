package com.example.yeditepem.services

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.yeditepem.model.testStudent
import org.json.JSONArray
import org.json.JSONObject



class DBStudentService(activity: AppCompatActivity) {

    /*
    private val queue = Volley.newRequestQueue(activity)

    fun getStudents() {
        val url = "${DynamoDBService.apiURL}/students"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                var responseString: String = response.toString()
                var data = JSONObject(responseString)
            },
            { Log.d("getStudents()", "That didn't work!") })

        queue.add(stringRequest)
    }

    fun getStudentById(id: String) {
        val url = "${DynamoDBService.apiURL}/student?id=${id}"

        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                var items: JSONArray = parseItems(response.toString())
                var data = parseItem(items[0].toString())
            },
            { Log.d("getStudentById()", "That didn't work!") })

        queue.add(stringRequest)

        //Log.d("getStudentById()", queue.responseDelivery.postResponse(stringRequest, ))

    }
    */
    fun parseItems(responseString: String): JSONArray {
        var data = JSONObject(responseString)
        return data.getJSONArray("Items")
    }

    fun parseItem(responseString: String): JSONObject {
        return JSONObject(responseString)
    }


}
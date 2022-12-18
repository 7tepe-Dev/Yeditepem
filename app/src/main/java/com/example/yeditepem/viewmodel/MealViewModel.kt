package com.example.yeditepem.viewmodel

import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.yeditepem.adapters.MealAdapter
import com.example.yeditepem.model.Meal
import com.example.yeditepem.services.ApiClient
import com.example.yeditepem.services.MealService
import kotlinx.coroutines.launch

class MealViewModel : ViewModel() {
    lateinit var mealService: MealService
    var mealList : MutableLiveData<List<Meal>> = MutableLiveData()

    private fun _getMeals() {
        mealService = ApiClient.getClient().create(MealService::class.java)
        viewModelScope.launch {
            mealList.value= mealService.getMeals()
        }
    }

    fun getMeals(activity: AppCompatActivity){
        _getMeals()
        mealList.observe(activity, Observer{
            if (mealList.value != null){
                print(mealList.value.toString())
                MealAdapter(activity, mealList.value!!)
            }
        })
    }


}
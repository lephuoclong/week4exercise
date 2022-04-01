package com.example.secondexercise.viewmodels

import android.content.Context
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.secondexercise.models.Restaurant
import com.example.secondexercise.utils.DataStore


class RestaurantViewModel : ViewModel() {
    private var _listRestaurant :MutableLiveData<ArrayList<Restaurant>> = MutableLiveData()

    val listRestaurant : LiveData<ArrayList<Restaurant>>
    get() = _listRestaurant

    fun getListRestaurant(context: Context) {
        DataStore.readJson(context)
        _listRestaurant.postValue(DataStore.listRestaurant)
    }
}
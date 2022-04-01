package com.example.secondexercise.features.list

import android.content.ClipData.Item
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.DefaultItemAnimator
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.secondexercise.adapters.RestaurantsAdapter
import com.example.secondexercise.models.Restaurant


class RestaurantActivity : AppCompatActivity() {
    private var _listRestaurant : MutableLiveData<ArrayList<Restaurant>> = MutableLiveData()
    private val recyclerView: RecyclerView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_restaurant)
        recyclerView = findViewById(R.id.rcv_restaurant)

        val listRestaurant : LiveData<ArrayList<Restaurant>>
        _listRestaurant

        rcv_restaurant.layoutManager = LinearLayoutManager(this)
        rcv_restaurant.setHasFixedSize(true)
        rcv_restaurant.itemAnimator = DefaultItemAnimator()
        rcv_restaurant.addItemDecoration(DividerItemDecoration(rcv_restaurant.context, DividerItemDecoration.VERTICAL))
        rcv_restaurant.adapter = RestaurantsAdapter(listRestaurant)

    }

    private void data(){
        listitem.add(Item("item1", R.drawable.react))
        listitem.add(Item("item2", R.drawable.java))
        listitem.add(Item("item3", R.drawable.adobe))
    }
}
package com.example.secondexercise.adapters

import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.recyclerview.widget.RecyclerView
import com.example.secondexercise.R
import com.example.secondexercise.models.Restaurant
import com.example.secondexercise.viewmodels.RestaurantViewModel

class RestaurantsAdapter : RecyclerView.Adapter<RestaurantsAdapter.RestaurantViewHolder> {

    inner class RestaurantViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        var restaurantName: TextView = itemView!!.findViewById(R.id.tv_restaurant_name)
    }

//    private lateinit var viewModel: RestaurantViewModel

//    private var arrMonthName: ArrayList<String>
//
//    constructor(arrMonthName: ArrayList<String>) : super() {
//        this.arrMonthName = arrMonthName
//    }
private var listRestaurant: ArrayList<Restaurant>
    constructor(listRestaurant: ArrayList<Restaurant>) : super() {
        this.listRestaurant = listRestaurant
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RestaurantViewHolder {
        return RestaurantViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_restaurant, parent, false))
    }

    override fun onBindViewHolder(holder: RestaurantViewHolder, position: Int) {
        if (holder != null) {
            holder.restaurantName.text = listRestaurant[position].toString()
            holder.itemView.setOnClickListener {
                Log.d("Click Item:", listRestaurant[position].toString())
            }
        }
    }

    override fun getItemCount(): Int {
        return listRestaurant.size
    }
}

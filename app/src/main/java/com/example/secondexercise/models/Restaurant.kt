package com.example.secondexercise.models

data class Restaurant(
    val Id: Long,
    val Name: String,
    val Address: String,
    val District: String,
    val City: String,
    val DistrictId: Int,
    val Location: String,
    val LocationId: Long,
    val Phone: String?,
    val Cuisines: ArrayList<Cuisine>,
    val SpecialDesc: String?,
    val Categories: ArrayList<Category>,
    val Services: ArrayList<Service>,
    val Latitude: Double,
    val Longitude: Double,
    val MainCategoryId: Long,
    val MasterCategoryId: Long,
    val HasDelivery: Long,
    val TotalReview: Long,
    val TotalView: Long,
    val TotalFavourite: Long,
    val TotalCheckins: Long,
    val TotalPictures: Long,
    val AvgRatin: String,
    val AvgRatingOriginal: Double,
    val PicturePath: String,
    val PicturePathLarge: String,
    val MobilePicturePath: String,
    val ReviewUrl: String,
    val AlbumUrl: String,
    val IconUrl: String,
    val IsAd: Long,
    val DetailUrl: String
)
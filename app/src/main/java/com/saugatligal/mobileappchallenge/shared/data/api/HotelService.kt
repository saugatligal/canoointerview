package com.saugatligal.mobileappchallenge.shared.data.api

import com.saugatligal.mobileappchallenge.Constants
import com.saugatligal.mobileappchallenge.hotelDetails.HotelDetails
import com.saugatligal.mobileappchallenge.hotels.domain.Hotel
import com.saugatligal.mobileappchallenge.hotels.domain.HotelBody
import com.saugatligal.mobileappchallenge.hotels.domain.HotelModelList
import com.saugatligal.mobileappchallenge.hotels.domain.HotelData
import retrofit2.http.*

interface HotelService {

    @Headers(Constants.API_KEY,
        Constants.API_HOST)
    @GET("locations/v3/search")
    suspend fun getHotelList(@Query("q") location: String?) : HotelData

    @Headers(Constants.API_KEY,
        Constants.API_HOST)
    @POST("properties/v2/list")
    suspend fun getHotelListWithCoordinate(@Body body: Hotel) : HotelModelList

    @Headers(Constants.API_KEY,
        Constants.API_HOST)
    @POST("properties/v2/detail")
    suspend fun getHotelDetail(@Body body: HotelBody) : HotelDetails
}
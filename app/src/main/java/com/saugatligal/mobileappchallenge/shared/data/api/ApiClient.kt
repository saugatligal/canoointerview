package com.saugatligal.mobileappchallenge.shared.data.api

import com.saugatligal.mobileappchallenge.Constants
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiClient {

        fun getClient() : HotelService {
            return Retrofit.Builder()
                .baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build().create(HotelService::class.java)
        }
}
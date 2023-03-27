package com.saugatligal.mobileappchallenge.shared.data

import com.saugatligal.mobileappchallenge.hotelDetails.HotelDetails
import com.saugatligal.mobileappchallenge.hotels.data.HotelListViewState
import com.saugatligal.mobileappchallenge.hotels.domain.HotelData
import com.saugatligal.mobileappchallenge.shared.Result

interface HotelRepository {

    /**
     * getHotelList is suspend
     * function to call hotel list service
     */
    suspend fun getHotelList(location: String?): Result<List<HotelListViewState>>

    /**
     * getHotelDetail is suspend
     * function to call hotel Detail service
     */
    suspend fun getHotelDetail(hotelId: String): Result<HotelDetails>
}
package com.saugatligal.mobileappchallenge.hotelDetails.presentation

import com.saugatligal.mobileappchallenge.hotelDetails.data.HotelDetailViewState

sealed class HotelDetailState{
    object Loading : HotelDetailState()
    data class Content(val hotelDetail : HotelDetailViewState): HotelDetailState()
    data class Error(val error: String) : HotelDetailState()
}

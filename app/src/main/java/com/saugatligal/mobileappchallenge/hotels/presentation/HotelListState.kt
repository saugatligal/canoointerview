package com.saugatligal.mobileappchallenge.hotels.presentation

import com.saugatligal.mobileappchallenge.hotels.data.HotelListViewState
import com.saugatligal.mobileappchallenge.hotels.domain.Property

sealed class HotelListState {
    object Loading : HotelListState()
    data class Content(val hotelList: List<HotelListViewState>) : HotelListState()
    data class Error(val error: String) : HotelListState()
}

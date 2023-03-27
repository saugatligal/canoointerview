package com.saugatligal.mobileappchallenge.hotelDetails.presentation

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saugatligal.mobileappchallenge.hotelDetails.data.HotelDetailViewState
import com.saugatligal.mobileappchallenge.shared.Result
import com.saugatligal.mobileappchallenge.shared.data.HotelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class HotelDetailViewModel @Inject constructor(
    private val repository: HotelRepository,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main
): ViewModel() {

    private val _viewState = MutableLiveData<HotelDetailState>()
    val viewState : LiveData<HotelDetailState>
        get() = _viewState

    /**
     * loadHotelDetails method is used
     * to call service and update the viewState livedata
     * @param hotelid is hotelid number which
     * is used to call exact hotel details from service
     */
    fun loadHotelDetails(hotelId: String?){
        viewModelScope.launch(dispatcher) {
            _viewState.postValue(HotelDetailState.Loading)
            when(val hotelDetails = hotelId?.let { repository.getHotelDetail(it) }){
                is com.saugatligal.mobileappchallenge.shared.Result.Success -> _viewState.postValue(HotelDetailState.Content(
                    HotelDetailViewState(
                       "Welcome to "+ hotelDetails.data.data.propertyInfo.summary.name,
                        hotelDetails.data.data.propertyInfo.summary.tagline,
                     "Address: "+   hotelDetails.data.data.propertyInfo.summary.location.address.addressLine,
                     "Rating: "+ hotelDetails.data.data.propertyInfo.reviewInfo.summary.overallScoreWithDescriptionA11y.value)
                ))
                is Result.Error -> _viewState.postValue(
                    HotelDetailState.Error(hotelDetails.errorMessage)
                )
                else -> {}
            }

        }
    }
}
package com.saugatligal.mobileappchallenge.hotels.presentation

import android.util.Log
import android.widget.Toast
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.saugatligal.mobileappchallenge.shared.Result
import com.saugatligal.mobileappchallenge.shared.Result.*
import com.saugatligal.mobileappchallenge.shared.data.HotelRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HotelListViewModel @Inject constructor(
    private val repository: HotelRepository,
    private val dispatcher: CoroutineDispatcher = Dispatchers.Main
) : ViewModel() {

    private val _viewState = MutableLiveData<HotelListState>()

    val viewState: LiveData<HotelListState>
        get() = _viewState

    /**
     * getHotelList method is used to
     * call list of Hotel service and get list of hotel
     * and update it to viewState livedata
     */
    fun getHotelList(location: String?) {
        viewModelScope.launch(dispatcher) {
            _viewState.postValue(HotelListState.Loading)

            when (val result = repository.getHotelList(location)) {
                is Success -> {
                    _viewState.postValue(HotelListState.Content(result.data))
                }
                is Error -> {
                    _viewState.postValue(HotelListState.Error(result.errorMessage))
                }
            }
        }
    }
}
package com.saugatligal.mobileappchallenge

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import com.saugatligal.mobileappchallenge.hotelDetails.*
import com.saugatligal.mobileappchallenge.hotelDetails.data.HotelDetailViewState
import com.saugatligal.mobileappchallenge.hotelDetails.presentation.HotelDetailState
import com.saugatligal.mobileappchallenge.hotelDetails.presentation.HotelDetailViewModel
import com.saugatligal.mobileappchallenge.shared.Result
import com.saugatligal.mobileappchallenge.shared.data.HotelRepository
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.test.StandardTestDispatcher
import kotlinx.coroutines.test.runTest
import org.junit.Before
import org.junit.Rule
import org.junit.Test
import org.junit.rules.TestRule

@ExperimentalCoroutinesApi
class HotelDetailViewModelTest {

    @get:Rule
    var rule: TestRule = InstantTaskExecutorRule()
    private val dispatcher = StandardTestDispatcher()

    private lateinit var viewModel: HotelDetailViewModel
    private val repository = mockk<HotelRepository>()

    private val hotelDetail =
        HotelDetails(
            Data(
                PropertyInfo(
                    "hotel",
                    Summary(
                        "hotel", "this is hotel",
                        Location(
                            "hotel",
                            Address(
                                "hotel",
                                "denton texas"
                            )
                        )
                    ), ReviewInfo(
                        "hotel",
                        Summary2(
                            "hotel",
                            OverallScoreWithDescriptionA11y(
                                "hotel",
                                "3 star"
                            )
                        )
                    )
                )
            )
        )


    @Before
    fun setUp() {
        coEvery {
            repository.getHotelDetail("1234")
        } returns Result.Success(hotelDetail)

        viewModel = HotelDetailViewModel(
            repository,
            dispatcher
        )
    }

    @Test
    fun `Load method correctly creates the ViewState`() = runTest {
        val values = mutableListOf<HotelDetailState>()
        viewModel.viewState.observeForever {
            values.add(it)
        }
        viewModel.loadHotelDetails("1234")
        dispatcher.scheduler.advanceUntilIdle()

        assert(values[0] is HotelDetailState.Loading)
        assert(
            values[1] ==
                    HotelDetailState.Content(
                        HotelDetailViewState(
                            "Welcome to hotel",
                            "this is hotel",
                            "Address: denton texas",
                            "Rating: 3 star"
                        )
                    )
        )
    }
}
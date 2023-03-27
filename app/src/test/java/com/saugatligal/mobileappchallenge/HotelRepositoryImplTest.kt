package com.saugatligal.mobileappchallenge

import com.saugatligal.mobileappchallenge.hotelDetails.*
import com.saugatligal.mobileappchallenge.hotels.domain.HotelBody
import com.saugatligal.mobileappchallenge.shared.Result
import com.saugatligal.mobileappchallenge.shared.data.HotelRepositoryImpl
import com.saugatligal.mobileappchallenge.shared.data.api.HotelService
import io.mockk.coEvery
import io.mockk.mockk
import kotlinx.coroutines.test.runTest
import kotlinx.coroutines.ExperimentalCoroutinesApi
import org.junit.Before
import org.junit.Test

@ExperimentalCoroutinesApi
class HotelRepositoryImplTest {

    private lateinit var repository: HotelRepositoryImpl
    private val service = mockk<HotelService>()

    @Before
    fun setup() {
        repository = HotelRepositoryImpl(service)
    }

    @Test
    fun `Repository correct maps entity into Business Objects`() = runTest {
        val hotelBody = HotelBody(propertyId = "22333")
        coEvery {
            service.getHotelDetail(hotelBody)
        } returns HotelDetails(
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
        val products = repository.getHotelDetail("22333") as Result.Success
        assert(products.data.data.propertyInfo.typename == "hotel")
    }
}
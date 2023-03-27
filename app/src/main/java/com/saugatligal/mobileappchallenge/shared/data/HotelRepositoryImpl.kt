package com.saugatligal.mobileappchallenge.shared.data

import android.util.Log
import com.saugatligal.mobileappchallenge.Constants
import com.saugatligal.mobileappchallenge.hotelDetails.HotelDetails
import com.saugatligal.mobileappchallenge.hotels.data.HotelListViewState
import com.saugatligal.mobileappchallenge.hotels.domain.*
import com.saugatligal.mobileappchallenge.shared.Result
import com.saugatligal.mobileappchallenge.shared.data.api.HotelService
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception
import java.net.UnknownHostException
import javax.inject.Inject

class HotelRepositoryImpl @Inject constructor(
    private val client: HotelService,
    private val coroutineDispatcher: CoroutineDispatcher = Dispatchers.IO
) : HotelRepository {

    override suspend fun getHotelList(location: String?): com.saugatligal.mobileappchallenge.shared.Result<List<HotelListViewState>> {
        return withContext(coroutineDispatcher) {
            try {
                val propertiesResult = mutableListOf<Property>()
                var hotelId = ""
                val regions: List<Region> = client.getHotelList(location).region
                regions.filter {
                    it.type == Constants.HOTEL && it.hotelId != null
                }.forEach { region ->
                    val hotel = Hotel(
                        destination = Destination(
                            Coordinates(
                                region.coordinates.lat,
                                region.coordinates.long
                            ),
                            regionId = region.cityId!!
                        )
                    )
                    val listOfProperty =
                        client.getHotelListWithCoordinate(hotel).data.propertySearch.properties
                    hotelId = region.hotelId!!
                    if (listOfProperty != null) {
                        propertiesResult.addAll(listOfProperty)
                    }
                }
                com.saugatligal.mobileappchallenge.shared.Result.Success(propertiesResult.map {
                    HotelListViewState(
                        it.name,
                        it.propertyImage.image.url,
                        it.offerBadge?.secondary?.text,
                        it.id
                    )
                })
            } catch (exception: Exception) {
                Log.d("TAG", "getHotelList: "+ exception.localizedMessage)
                Result.Error(Constants.ERROR_MESSAGE)
            } catch (exception: UnknownHostException) {
                Result.Error(Constants.NO_INTERNET_MESSAGE)
            }
        }
    }

    override suspend fun getHotelDetail(hotelId: String): Result<HotelDetails> {
        return withContext(Dispatchers.IO) {
            try {
                val hotelBody = HotelBody(propertyId = hotelId)
                Result.Success(
                    client.getHotelDetail(hotelBody)
                )
            } catch (exception: Exception) {
                Result.Error(Constants.ERROR_MESSAGE)
            } catch (exception: UnknownHostException) {
                Result.Error(Constants.NO_INTERNET_MESSAGE)
            }
        }
    }
}
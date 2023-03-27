package com.saugatligal.mobileappchallenge.hotels.domain

import com.google.gson.annotations.SerializedName

data class HotelData(
    val q: String,
    val rid: String,
    val rc: String,
    @SerializedName("sr")
    val region: List<Region>,
)

data class Region(
    val index: String,
    val gaiaId: String,
    val type: String,
    val regionNames: RegionNames,
    val essId: EssId,
    val coordinates: Coordinates,
    val hierarchyInfo: HierarchyInfo,
    val hotelId: String?,
    val cityId: String?,
    val hotelAddress: HotelAddress?,
    val isMinorAirport: String?,
)

data class RegionNames(
    val fullName: String,
    val shortName: String,
    val displayName: String,
    val primaryDisplayName: String,
    val secondaryDisplayName: String,
    val lastSearchName: String,
)

data class EssId(
    val sourceName: String,
    val sourceId: String,
)

data class Coordinates(
    val lat: Double,
    val long: Double,
)

data class HierarchyInfo(
    val country: Country,
)

data class Country(
    val name: String?,
    val isoCode2: String?,
    val isoCode3: String,
)

data class HotelAddress(
    val street: String,
    val city: String,
    val province: String,
)

enum class RegionType{
    HOTEL,CITY
}

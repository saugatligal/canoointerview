package com.saugatligal.mobileappchallenge.hotels.domain

data class Hotel(
    val currency: String = "USD",
    val eapid: Long = 1,
    val locale: String = "en_US",
    val siteId: Long = 300000001,
    val destination: Destination = Destination(Coordinates(0.0,0.0),"6054439"),
    val checkInDate: CheckInDate = CheckInDate(10,10,2022),
    val checkOutDate: CheckOutDate = CheckOutDate(15,10,2022),
    val rooms: List<Room> = listOf(Room(2,listOf(Children(5), Children(7))),),
    val resultsStartingIndex: Long = 0,
    val resultsSize: Long = 50,
    val sort: String = "PRICE_LOW_TO_HIGH",
    val filters: Filters = Filters(Price(150,100)),
)


data class Destination(
    val coordinates: Coordinates,
    val regionId: String ="6054439",
)

data class CheckInDate(
    val day: Long = 10,
    val month: Long = 10,
    val year: Long = 2022,
)

data class CheckOutDate(
    val day: Long =15,
    val month: Long= 10,
    val year: Long=2022,
)

data class Room(
    val adults: Long = 2,
    val children: List<Children> = listOf(Children(5), Children(7)),
)

data class Children(
    val age: Long = 5,
)

data class Filters(
    val price: Price = Price(150,100),
)

data class Price(
    val max: Long = 150,
    val min: Long = 100,
)

data class HotelBody(
    val currency: String?= "USD",
    val eapid: Long?=1,
    val locale: String?="en_US",
    val siteId: Long?=300000001,
    val propertyId: String,
)

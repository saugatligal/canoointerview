package com.saugatligal.mobileappchallenge.di

import com.saugatligal.mobileappchallenge.shared.data.HotelRepository
import com.saugatligal.mobileappchallenge.shared.data.HotelRepositoryImpl
import com.saugatligal.mobileappchallenge.shared.data.api.ApiClient
import com.saugatligal.mobileappchallenge.shared.data.api.HotelService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.ExperimentalCoroutinesApi

@ExperimentalCoroutinesApi
@Module
@InstallIn(SingletonComponent::class)
class RepositoryModule {

    @Provides
    fun provideHotelService(): HotelService = ApiClient.getClient()

    @Provides
    fun provideHotelRepositoryImpl(
        client: HotelService
    ): HotelRepositoryImpl = HotelRepositoryImpl(client)

    @Provides
    fun provideHotelRepository(
        hotelRepositoryImpl: HotelRepositoryImpl
    ): HotelRepository = hotelRepositoryImpl

    @Provides
    fun providesIoDispatcher(): CoroutineDispatcher = Dispatchers.IO
}
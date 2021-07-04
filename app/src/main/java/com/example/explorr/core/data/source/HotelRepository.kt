package com.example.explorr.core.data.source

import androidx.lifecycle.asLiveData
import com.example.explorr.core.data.source.local.LocalDataSource
import com.example.explorr.core.data.source.remote.RemoteDataSource
import com.example.explorr.core.data.source.remote.network.ApiResponse
import com.example.explorr.core.data.source.remote.response.PlaceItem
import com.example.explorr.core.domain.repository.IHotelRepository
import com.example.explorr.core.utils.AppExecutors
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*

class HotelRepository(
    private val remoteDataSource: RemoteDataSource,
    private val localDataSource: LocalDataSource,
    private val appExecutors: AppExecutors
){



}
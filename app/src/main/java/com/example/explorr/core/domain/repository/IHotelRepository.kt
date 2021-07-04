package com.example.explorr.core.domain.repository

import com.example.explorr.core.data.source.remote.network.ApiResponse
import com.example.explorr.core.data.source.remote.response.PlaceItem
import cz.msebera.android.httpclient.client.cache.Resource
import kotlinx.coroutines.flow.Flow

interface IHotelRepository {

    //suspend fun getPlace(query:String, accessToken : String) : Flow<ApiResponse<List<PlaceItem>>>
}
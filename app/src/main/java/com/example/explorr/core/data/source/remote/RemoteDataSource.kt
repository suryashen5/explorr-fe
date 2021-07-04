package com.example.explorr.core.data.source.remote

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.example.explorr.core.data.source.remote.network.ApiResponse
import com.example.explorr.core.data.source.remote.network.ApiService
import com.example.explorr.core.data.source.remote.response.PlaceItem
import com.example.explorr.core.data.source.remote.response.PlaceResponse
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import kotlinx.coroutines.flow.flowOn
import java.lang.Exception

class RemoteDataSource(private val apiService: ApiService) {

    suspend fun getPlaces(query: String, accessToken: String) : Flow<ApiResponse<List<PlaceItem>>>{
        return flow {
            try {
                val response = apiService.getPlace(query,accessToken).features
                if(response!=null){
                    emit(ApiResponse.Success(response))
                }else{
                    emit(ApiResponse.Empty)
                }
            } catch (e : Exception){
                emit(ApiResponse.Error(e.toString()))
                Log.e("RemoteDataSource", e.toString())
            }
        }.flowOn(Dispatchers.IO)
    }

}
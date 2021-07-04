package com.example.explorr.core.data.source.remote.network

import com.example.explorr.core.data.source.remote.response.PlaceResponse
import retrofit2.http.GET
import retrofit2.http.Path
import retrofit2.http.Query

interface ApiService {

    @GET("mapbox.places/{query}.json")
    suspend fun getPlace(
        @Path("query") query: String,
        @Query("access_token") accessToken: String,
        @Query("autocomplete") autoComplete: Boolean = true
    ): PlaceResponse

}

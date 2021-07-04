package com.example.explorr.core.data.source.network

import com.example.explorr.core.data.source.PlaceResponse
import com.example.explorr.core.data.source.response.listhotel.Response
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

    @GET("explore")
    suspend fun getAllHotels() : Response

}

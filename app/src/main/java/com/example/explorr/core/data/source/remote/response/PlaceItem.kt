package com.example.explorr.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class PlaceItem (
    @field:SerializedName("place_name")
    val placeName: String
    )
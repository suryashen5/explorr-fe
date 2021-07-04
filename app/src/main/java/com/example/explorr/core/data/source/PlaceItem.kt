package com.example.explorr.core.data.source

import com.google.gson.annotations.SerializedName

data class PlaceItem (
    @field:SerializedName("place_name")
    val placeName: String
    )
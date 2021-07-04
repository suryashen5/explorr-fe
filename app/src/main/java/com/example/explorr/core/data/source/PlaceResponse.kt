package com.example.explorr.core.data.source

import com.google.gson.annotations.SerializedName

data class PlaceResponse (
    @field:SerializedName("features")
    val features: List<PlaceItem>
    )
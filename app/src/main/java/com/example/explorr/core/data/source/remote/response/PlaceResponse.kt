package com.example.explorr.core.data.source.remote.response

import com.google.gson.annotations.SerializedName

data class PlaceResponse (
    @field:SerializedName("features")
    val features: List<PlaceItem>
    )
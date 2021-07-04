package com.example.explorr.core.data.source.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "user")
data class HotelEntity (

    @PrimaryKey
    @NonNull
    @ColumnInfo(name = "id")
    var id: String
)
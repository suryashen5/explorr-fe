package com.example.explorr.core.data.source.detail

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


data class DetailHotelResponse(

	@field:SerializedName("data")
	val data: Data? = null,

	@field:SerializedName("success")
	val success: Boolean? = null
)


data class Data(

	@field:SerializedName("hotel")
	val hotel: Hotel? = null,

	@field:SerializedName("hotel_facility")
	val hotelFacility: List<HotelFacilityItem?>? = null
)


data class Hotel(

	@field:SerializedName("hashtag_list_id")
	val hashtagListId: String? = null,

	@field:SerializedName("address")
	val address: String? = null,

	@field:SerializedName("updated_at")
	val updatedAt: Any? = null,

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("description")
	val description: String? = null,

	@field:SerializedName("created_at")
	val createdAt: Any? = null,

	@field:SerializedName("location")
	val location: String? = null,

	@field:SerializedName("id")
	val id: Int? = null,

	@field:SerializedName("facility_list_id")
	val facilityListId: String? = null
)


data class HotelFacilityItem(

	@field:SerializedName("name")
	val name: String? = null,

	@field:SerializedName("id")
	val id: Int? = null
)

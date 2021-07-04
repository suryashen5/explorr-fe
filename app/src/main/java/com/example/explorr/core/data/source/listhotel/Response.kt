package com.example.explorr.core.data.source.response.listhotel

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class Response(
    @field:SerializedName("hotel_list")
	val hotelList: List<HotelListItem?>? = null,

    @field:SerializedName("hashtag_list")
	val hashtagList: List<String?>? = null,

    @field:SerializedName("current_hashtag")
	val currentHashtag: String? = null
) : Parcelable


@Parcelize
data class HotelListItem(

    @field:SerializedName("image")
	val image: String? = null,

    @field:SerializedName("average_score")
	val averageScore: String? = null,

    @field:SerializedName("hashtags")
	val hashtags: List<HashtagsItem?>? = null,

    @field:SerializedName("price")
	val price: Int? = null,

    @field:SerializedName("name")
	val name: String? = null,

    @field:SerializedName("total_reviews")
	val totalReviews: Int? = null,

    @field:SerializedName("id")
	val id: Int? = null
) : Parcelable

@Parcelize
data class Image(

	@field:SerializedName("path")
	val path: String? = null,

	@field:SerializedName("hotel_id")
	val hotelId: Int? = null
) : Parcelable

@Parcelize
data class HashtagsItem(

	@field:SerializedName("hashtag_id")
	val hashtagId: Int? = null,

	@field:SerializedName("name")
	val name: String? = null
) : Parcelable

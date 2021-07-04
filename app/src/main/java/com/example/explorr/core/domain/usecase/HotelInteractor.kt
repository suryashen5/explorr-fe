package com.example.explorr.core.domain.usecase

import com.example.explorr.core.data.source.remote.network.ApiResponse
import com.example.explorr.core.data.source.remote.response.PlaceItem
import com.example.explorr.core.domain.repository.IHotelRepository
import kotlinx.coroutines.flow.Flow

class HotelInteractor(private val hotelRepository: IHotelRepository) : HotelUseCase {

    //override suspend fun getPlace(query: String, accessToken: String): List<PlaceItem> = hotelRepository.getPlace(query,accessToken)


}
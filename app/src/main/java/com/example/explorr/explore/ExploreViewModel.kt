package com.example.explorr.explore

import androidx.lifecycle.ViewModel
import androidx.lifecycle.asLiveData
import com.example.explorr.core.data.source.network.ApiConfig
import kotlinx.coroutines.ExperimentalCoroutinesApi
import kotlinx.coroutines.FlowPreview
import kotlinx.coroutines.channels.BroadcastChannel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.*

@FlowPreview
@ExperimentalCoroutinesApi
class ExploreViewModel : ViewModel() {

    private val accessToken = "pk.eyJ1IjoiamVtcG9sa2FraSIsImEiOiJja3FvaXBneHYwZDJ1MnFtaXltbTRuYzF4In0.nJCoQ3BEwPz9-odUU4g5FA"
    val channel = BroadcastChannel<String>(Channel.CONFLATED)

    val placeResult = channel.asFlow()
        .debounce(300)
        .distinctUntilChanged()
        .filter {
            it.trim().isNotEmpty()
        }
        .mapLatest {
            ApiConfig.geoService().getPlace(it, accessToken).features
        }
        .asLiveData()

    


}
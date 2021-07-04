package com.example.explorr.core.di

import com.example.explorr.core.data.source.HotelRepository
import com.example.explorr.core.data.source.local.LocalDataSource
import com.example.explorr.core.data.source.remote.RemoteDataSource
import com.example.explorr.core.data.source.remote.network.ApiService
import com.example.explorr.core.domain.repository.IHotelRepository
import com.example.explorr.core.utils.AppExecutors
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit
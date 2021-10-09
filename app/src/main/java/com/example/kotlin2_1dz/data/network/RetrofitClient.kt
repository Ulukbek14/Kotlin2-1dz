package com.example.kotlin2_1dz.data.network

import com.example.kotlin2_1dz.data.network.apiservice.CharacterApiService
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient {

    private val retrofitClient = Retrofit.Builder().baseUrl("https://rickandmortyapi.com/")
        .addConverterFactory(GsonConverterFactory.create()).build()

    fun providerApiService(): CharacterApiService {
        return retrofitClient.create(CharacterApiService::class.java)
    }
}
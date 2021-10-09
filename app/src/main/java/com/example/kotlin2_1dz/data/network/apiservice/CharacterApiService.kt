package com.example.kotlin2_1dz.data.network.apiservice

import com.example.kotlin2_1dz.model.CharacterModel
import com.example.kotlin2_1dz.model.RickAndMortyModel
import retrofit2.http.GET

interface CharacterApiService {
    @GET("api/character")
    fun getCharacter(): retrofit2.Call<RickAndMortyModel<CharacterModel>>
}
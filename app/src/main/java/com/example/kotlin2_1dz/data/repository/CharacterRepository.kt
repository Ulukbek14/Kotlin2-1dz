package com.example.kotlin2_1dz.data.repository

import androidx.lifecycle.MutableLiveData
import com.example.kotlin2_1dz.data.network.apiservice.CharacterApiService
import com.example.kotlin2_1dz.model.CharacterModel
import com.example.kotlin2_1dz.model.RickAndMortyModel
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class CharacterRepository(private val apiService: CharacterApiService, ) {

    fun fetchCharacter(): MutableLiveData<RickAndMortyModel<CharacterModel>> {
        val liveData: MutableLiveData<RickAndMortyModel<CharacterModel>> = MutableLiveData()
        apiService.getCharacter()
            .enqueue(object : Callback<RickAndMortyModel<CharacterModel>> {
                override fun onResponse(
                    call: Call<RickAndMortyModel<CharacterModel>>,
                    response: Response<RickAndMortyModel<CharacterModel>>) {
                    liveData.value = response.body()
                }

                override fun onFailure(
                    call: Call<RickAndMortyModel<CharacterModel>>,
                    t: Throwable) {
                    liveData.value = null
                }
            })
        return liveData
    }
}
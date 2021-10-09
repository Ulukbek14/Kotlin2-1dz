package com.example.kotlin2_1dz.ui.fragment.character

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.kotlin2_1dz.data.repository.CharacterRepository
import com.example.kotlin2_1dz.model.CharacterModel
import com.example.kotlin2_1dz.model.RickAndMortyModel

class CharacterViewModel(private val repository: CharacterRepository) : ViewModel() {

    fun getCharacterList (): MutableLiveData<RickAndMortyModel<CharacterModel>> {
        return repository.fetchCharacter()
    }
}
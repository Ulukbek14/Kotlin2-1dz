package com.example.kotlin2_1dz.model

import com.google.gson.annotations.SerializedName

data class CharacterModel(

    @SerializedName("id")
    var id: Int,

    @SerializedName("name")
    var name: String,

    @SerializedName("image")
    var image: String
)
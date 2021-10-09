package com.example.kotlin2_1dz.model

import com.google.gson.annotations.SerializedName

data class RickAndMortyModel <T>(

    @SerializedName("info")
    val info : Info,

    @SerializedName("results")
    var results: ArrayList<T>
)
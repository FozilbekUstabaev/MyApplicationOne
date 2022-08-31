package com.example.myapplication1.madel

import com.example.myapplication1.date.RickAndMortyApi
import com.google.gson.annotations.SerializedName

data class EpisodeResult(
    val id: RickAndMortyApi? = null,
    val name:String? = null,
    @SerializedName("air_date")
    val airDate:String? = null,
    val episode:String? = null
)
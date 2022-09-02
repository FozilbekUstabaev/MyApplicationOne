package com.example.myapplication1.date

import com.example.myapplication1.common.Resourse
import com.example.myapplication1.madel.CharacrterResult
import com.example.myapplication1.madel.EpisodeResult
import com.example.myapplication1.madel.LocationResult
import com.example.myapplication1.madel.MainResponse
import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    fun getCharacter(): Call<MainResponse<CharacrterResult>>

    @GET("location")
    fun getLocation(): Call<MainResponse<LocationResult>>

    @GET("episode")
    fun getEpisode(): Call<MainResponse<EpisodeResult>>
}
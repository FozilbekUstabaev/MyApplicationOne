package com.example.myapplication1.date

import com.example.myapplication1.madel.MainResponse
import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("character")
    fun getCharacter(): Call<MainResponse>

    @GET("location")
    fun getLocation(): Call<MainResponse>

    @GET("episode")
    fun getEpisode(): Call<MainResponse>
}
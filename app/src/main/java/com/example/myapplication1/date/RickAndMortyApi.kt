package com.example.myapplication1.date

import retrofit2.Call
import retrofit2.http.GET

interface RickAndMortyApi {
    @GET("/character")
    fun getCharacter(): Call<MatchResult>
}
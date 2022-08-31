package com.example.myapplication1.ui

import android.app.Application
import com.example.myapplication1.date.RickAndMortyApi
import com.example.myapplication1.date.repository.MainEpisode
import com.example.myapplication1.date.repository.MainLocation
import com.example.myapplication1.date.repository.MainRepository
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class App : Application() {
    companion object {
        lateinit var repo: MainRepository
        lateinit var location: MainLocation
        lateinit var episode: MainEpisode
    }

    override fun onCreate() {
        super.onCreate()
        //Character
        val api = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/character/")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickAndMortyApi::class.java)
        repo = MainRepository(api)
        //Location
        val location1 = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/location")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickAndMortyApi::class.java)
        location = MainLocation(location1)
        //Episode
        val episode1 = Retrofit.Builder()
            .baseUrl("https://rickandmortyapi.com/api/episode")
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RickAndMortyApi::class.java)
        episode = MainEpisode(episode1)
    }
}
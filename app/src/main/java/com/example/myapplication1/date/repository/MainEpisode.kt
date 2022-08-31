package com.example.myapplication1.date.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.myapplication1.date.RickAndMortyApi
import com.example.myapplication1.madel.MainResponse
import retrofit2.Call
import retrofit2.Response

class MainEpisode(private val api: RickAndMortyApi) {
    fun getEpisode(): MutableLiveData<MainResponse> {
        val episode = MutableLiveData<MainResponse>()
        api.getEpisode().enqueue(object : retrofit2.Callback<MainResponse> {
                override fun onResponse(call: Call<MainResponse>, response: Response<MainResponse>) {
                if (response.isSuccessful) {
                    episode.value = response.body()
                } else {
                    Log.e("ololo", response.message())
                }
            }
            override fun onFailure(call: Call<MainResponse>, t: Throwable) {
                t.message?.let { Log.e("ololo", it) }
            }
        })
        return episode
    }
}
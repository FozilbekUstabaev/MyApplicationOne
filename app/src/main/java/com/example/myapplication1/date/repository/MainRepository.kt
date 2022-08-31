package com.example.myapplication1.date.repository

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.example.myapplication1.date.RickAndMortyApi
import com.example.myapplication1.madel.MainResponse
import retrofit2.Call
import retrofit2.Response

class MainRepository(private val api: RickAndMortyApi) {

    fun getCharacter(): MutableLiveData<MainResponse> {
        val liveData = MutableLiveData<MainResponse>()
        api.getCharacter().enqueue(object : retrofit2.Callback<MainResponse> {
            override fun onResponse(call: Call<MainResponse>, response: Response<MainResponse>) {
                if (response.isSuccessful) {
                    liveData.value = response.body()
                } else {
                    Log.e("oleo", response.message())
                }
            }
            override fun onFailure(call: Call<MainResponse>, t: Throwable) {
                t.message?.let { Log.e("oleo", it) }
            }

        })
        return liveData
    }
}
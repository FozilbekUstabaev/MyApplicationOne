package com.example.myapplication1.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication1.madel.MainResponse
import com.example.myapplication1.ui.App

class DashboardViewMadel : ViewModel() {

    var episode = MutableLiveData<MainResponse>()

    fun getEpisode() {
        episode = App.episode.getEpisode()
    }
}
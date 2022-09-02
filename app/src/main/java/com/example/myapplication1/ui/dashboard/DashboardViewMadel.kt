package com.example.myapplication1.ui.dashboard

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication1.common.Resourse
import com.example.myapplication1.madel.CharacrterResult
import com.example.myapplication1.madel.EpisodeResult
import com.example.myapplication1.madel.MainResponse
import com.example.myapplication1.ui.App

class DashboardViewMadel : ViewModel() {
    var liveDate = MutableLiveData<Resourse<MainResponse<EpisodeResult>?>>()
    fun getEpisode() {
        liveDate = App.episode.getEpisode()
    }
}
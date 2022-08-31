package com.example.myapplication1.ui.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication1.madel.MainResponse
import com.example.myapplication1.ui.App

class HomeViewModel : ViewModel() {
    var liveDate = MutableLiveData<MainResponse>()

    fun getCharacter() {
        liveDate = App.repo.getCharacter()
    }
}
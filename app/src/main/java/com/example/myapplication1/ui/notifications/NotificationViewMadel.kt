package com.example.myapplication1.ui.notifications

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication1.madel.MainResponse
import com.example.myapplication1.ui.App

class NotificationViewMadel : ViewModel() {

    var location = MutableLiveData<MainResponse>()

    fun getLocation() {
        location = App.location.getLocation()
    }
}
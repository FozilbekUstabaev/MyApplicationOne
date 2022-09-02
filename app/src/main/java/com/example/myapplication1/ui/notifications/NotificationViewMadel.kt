package com.example.myapplication1.ui.notifications

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.myapplication1.common.Resourse
import com.example.myapplication1.madel.CharacrterResult
import com.example.myapplication1.madel.LocationResult
import com.example.myapplication1.madel.MainResponse
import com.example.myapplication1.ui.App

class NotificationViewMadel : ViewModel() {

    var liveDate = MutableLiveData<Resourse<MainResponse<LocationResult>?>>()
    fun getLocation() {
        liveDate = App.location.getLocation()
    }
}
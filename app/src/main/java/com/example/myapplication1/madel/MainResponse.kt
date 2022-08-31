package com.example.myapplication1.madel

import com.example.myapplication1.date.repository.MainLocation

data class MainResponse(
    val results: List<CharacrterResult>,
    val location: List<LocationResult>,
    val episode: List<EpisodeResult>,
)
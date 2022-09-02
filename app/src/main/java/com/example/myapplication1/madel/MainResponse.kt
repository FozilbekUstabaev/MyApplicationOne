package com.example.myapplication1.madel


data class MainResponse<T>(
    val results: List<T>,
)
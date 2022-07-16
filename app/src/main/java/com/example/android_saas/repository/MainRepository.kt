package com.example.android_saas.repository

import com.example.android_saas.network.ApiService
import javax.inject.Inject

class MainRepository @Inject constructor(
    private val apiService: ApiService,
) {
    suspend fun getAllPhotos(page:Int, per_page:Int) = apiService.getPhotos(page, per_page)

}
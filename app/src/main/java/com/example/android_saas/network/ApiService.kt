package com.example.android_saas.network

import com.example.android_saas.model.HomePhotoItem
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("photos")
    suspend fun getPhotos(
        @Query("page") page: Int,
        @Query("per_page") perPage: Int
    ): List<HomePhotoItem>

}
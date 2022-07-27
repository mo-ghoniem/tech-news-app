package com.example.technewsapp.data.remote

import com.example.technewsapp.data.remote.dto.NewsResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface NewsApi {

    @GET("v2/top-headlines")
    suspend fun getNews(
        @Query("category")
        category: String = "technology",
        @Query("apiKey")
        apiKey: String,
        @Query("language")
        languageCode: String = "en"
    ): Response<NewsResponse>

    @GET("v2/everything")
    suspend fun searchForNews(
        @Query("category")
        category: String = "technology",
        @Query("apiKey")
        apiKey: String,
        @Query("language")
        languageCode: String = "en",
        @Query("q")
        searchQuery: String,
        @Query("page")
        pageNumber: Int = 1
    ): Response<NewsResponse>

}
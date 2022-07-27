package com.example.technewsapp.domain.repository

import com.example.technewsapp.domain.model.NewsModel
import com.example.technewsapp.utils.Resource

interface NewsRepository {
    suspend fun getNewsArticles(): Resource<List<NewsModel>>
}
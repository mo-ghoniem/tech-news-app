package com.example.technewsapp.domain.model

import androidx.room.PrimaryKey

data class NewsModel(
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val imageUrl: String,
    val date: String,
    val content: String,
    val source: String,
)

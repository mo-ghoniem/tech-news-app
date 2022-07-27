package com.example.technewsapp.data.local

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "articles")
data class NewsEntity(
    val author: String,
    val title: String,
    val description: String,
    val url: String,
    val imageUrl: String,
    val date: String,
    val content: String,
    val source: String,
    @PrimaryKey(autoGenerate = true) val id: Int? = null
)

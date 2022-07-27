package com.example.technewsapp.data.local

import androidx.room.*

@Dao
interface NewsDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertNewsArticle(article: NewsEntity)

    @Query("DELETE FROM articles")
    suspend fun clearNewsArticles()

    @Delete
    suspend fun deleteArticle(article: NewsEntity)
}
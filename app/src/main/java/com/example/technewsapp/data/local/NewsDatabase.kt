package com.example.technewsapp.data.local

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(
    entities = [NewsEntity::class],
    version = 1

)
abstract class NewsDatabase : RoomDatabase(){
    abstract val newsDao : NewsDao
}
package com.example.technewsapp.data.mappers

import com.example.technewsapp.data.local.NewsEntity
import com.example.technewsapp.data.remote.dto.Article
import com.example.technewsapp.domain.model.NewsModel

class NewsMapper {

    /* a mapper function to map news response or article coming from api to NewsModel */
    fun newsDtoToNewsModel(article: Article): NewsModel{
        return NewsModel(
            author = article.author,
            date = article.publishedAt,
            title = article.title,
            description = article.description,
            url = article.url,
            imageUrl = article.urlToImage,
            content = article.content,
            source = article.source.name
        )
    }
}
package com.juanpablotomas.listingtestapp.domain.usecases.articles

import com.juanpablotomas.listingtestapp.domain.entities.Article

interface ArticlesUseCaseInterface {
    suspend fun getAllArticles(): List<Article>
    suspend fun getArticlesBySource(source: String): List<Article>
}
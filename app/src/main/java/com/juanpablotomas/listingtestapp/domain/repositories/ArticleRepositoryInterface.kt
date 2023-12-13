package com.juanpablotomas.listingtestapp.domain.repositories


import com.juanpablotomas.listingtestapp.domain.entities.Article

interface ArticleRepositoryInterface {
    suspend fun getAllArticles(): List<Article>
}
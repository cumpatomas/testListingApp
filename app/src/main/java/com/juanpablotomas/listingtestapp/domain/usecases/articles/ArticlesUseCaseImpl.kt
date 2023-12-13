package com.juanpablotomas.listingtestapp.domain.usecases.articles

import com.juanpablotomas.listingtestapp.domain.entities.Article
import com.juanpablotomas.listingtestapp.domain.repositories.ArticleRepositoryInterface

class ArticlesUseCaseImpl(private val repository: ArticleRepositoryInterface) :
    ArticlesUseCaseInterface {
    override suspend fun getAllArticles(): List<Article> {
        return repository.getAllArticles()
    }

    override suspend fun getArticlesBySource(source: String): List<Article> {
        return repository.getAllArticles().filter { it.source == source }
    }
}
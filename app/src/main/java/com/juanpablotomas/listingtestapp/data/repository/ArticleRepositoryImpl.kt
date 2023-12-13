package com.juanpablotomas.listingtestapp.data.repository

import com.juanpablotomas.listingtestapp.data.datasource.article.RemoteArticleDataSourceInterface
import com.juanpablotomas.listingtestapp.data.datasource.article.remote.dto.ArticleDto
import com.juanpablotomas.listingtestapp.domain.entities.Article
import com.juanpablotomas.listingtestapp.domain.repositories.ArticleRepositoryInterface


class ArticleRepositoryImpl(
    private val remoteDataSource: RemoteArticleDataSourceInterface
) : ArticleRepositoryInterface {

    override suspend fun getAllArticles(): List<Article> {

        return remoteDataSource.getAll().map { it.toDomain() }
    }

    fun ArticleDto.toDomain(): Article = Article(
        id = id,
        title = title,
        date = date,
        link = link,
        photo = photo,
        source = source
    )
}
package com.juanpablotomas.listingtestapp.data.datasource.article

import com.juanpablotomas.listingtestapp.data.datasource.article.remote.dto.ArticleDto

interface RemoteArticleDataSourceInterface {
    suspend fun getAll(): List<ArticleDto>
}
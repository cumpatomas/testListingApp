package com.juanpablotomas.listingtestapp.data.datasource.article.remote

import com.juanpablotomas.listingtestapp.data.datasource.article.RemoteArticleDataSourceInterface
import com.juanpablotomas.listingtestapp.data.datasource.article.remote.api.RemoteArticleApi
import com.juanpablotomas.listingtestapp.data.datasource.article.remote.dto.ArticleDto
import javax.inject.Inject

class RemoteArticleDataSourceImplementation @Inject constructor(
    private val api: RemoteArticleApi
) : RemoteArticleDataSourceInterface {
    override suspend fun getAll(): List<ArticleDto> {
        val response =
            api.getAllArticles("top-headlines?sources=bbc-news&apiKey=e2d66783ec0a4cb095d247c649323059")
        if (response.isSuccessful) {
            return response.body()?.articles ?: emptyList()
        } else {
            throw Exception("Articles reception FAILED")
        }
    }
}
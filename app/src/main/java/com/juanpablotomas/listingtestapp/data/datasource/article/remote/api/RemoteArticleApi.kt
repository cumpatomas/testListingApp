package com.juanpablotomas.listingtestapp.data.datasource.article.remote.api

import com.juanpablotomas.listingtestapp.data.datasource.article.remote.dto.ArticleResponseDto
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Url

interface RemoteArticleApi {

    @GET
    suspend fun getAllArticles(
        @Url url: String
    ): Response<ArticleResponseDto>
}
package com.juanpablotomas.listingtestapp.data.datasource.article.remote.dto

import com.google.gson.annotations.SerializedName


data class ArticleResponseDto(
    val articles: List<ArticleDto> = listOf()
)

data class ArticleDto(
    val id: Int,
    @SerializedName("title")
    val title: String,
    @SerializedName("publishedAt")
    val date: String,
    @SerializedName("url")
    val link: String,
    @SerializedName("urlToImage")
    val photo: String,
    @SerializedName("author")
    val source: String,
)

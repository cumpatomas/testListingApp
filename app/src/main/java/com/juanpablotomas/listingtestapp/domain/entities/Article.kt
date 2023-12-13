package com.juanpablotomas.listingtestapp.domain.entities

import com.google.gson.annotations.SerializedName


data class Article(
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
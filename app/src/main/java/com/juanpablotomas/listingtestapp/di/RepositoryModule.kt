package com.juanpablotomas.listingtestapp.di

import com.juanpablotomas.listingtestapp.data.datasource.article.RemoteArticleDataSourceInterface
import com.juanpablotomas.listingtestapp.data.repository.ArticleRepositoryImpl
import com.juanpablotomas.listingtestapp.domain.repositories.ArticleRepositoryInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {
    @Provides
    fun providesRemoteArticlesRepository(implementation: RemoteArticleDataSourceInterface): ArticleRepositoryInterface =
        ArticleRepositoryImpl(implementation)
}
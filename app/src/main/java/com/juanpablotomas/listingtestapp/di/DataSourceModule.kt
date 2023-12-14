package com.juanpablotomas.listingtestapp.di

import com.juanpablotomas.listingtestapp.data.datasource.article.RemoteArticleDataSourceInterface
import com.juanpablotomas.listingtestapp.data.datasource.article.remote.RemoteArticleDataSourceImplementation
import com.juanpablotomas.listingtestapp.data.datasource.article.remote.api.RemoteArticleApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {
    @Provides
    fun providesRemoteArticleDataSource(api: RemoteArticleApi): RemoteArticleDataSourceInterface =
        RemoteArticleDataSourceImplementation(api)
}
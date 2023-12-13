package com.juanpablotomas.listingtestapp.di

import com.juanpablotomas.listingtestapp.domain.repositories.ArticleRepositoryInterface
import com.juanpablotomas.listingtestapp.domain.usecases.articles.ArticlesUseCaseImpl
import com.juanpablotomas.listingtestapp.domain.usecases.articles.ArticlesUseCaseInterface
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCasesModule {
    @Provides
    fun provideRemoteGetAllArticlesUseCase(articlesRepository: ArticleRepositoryInterface)
            : ArticlesUseCaseInterface = ArticlesUseCaseImpl(articlesRepository)
}
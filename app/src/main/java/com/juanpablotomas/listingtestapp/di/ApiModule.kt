package com.example.mynewsapp.manualdi

import com.juanpablotomas.listingtestapp.data.datasource.article.remote.api.RemoteArticleApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

@Module
@InstallIn(SingletonComponent::class)
object ApiModule {
    @Provides
    fun provideRetrofit(okHttpClient: OkHttpClient): RemoteArticleApi {
        return Retrofit.Builder()
            .addConverterFactory(GsonConverterFactory.create())
            .client(okHttpClient)
            .baseUrl("https://newsapi.org/v2/")
            .build()
            .create(RemoteArticleApi::class.java)
    }
    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        val interceptor = HttpLoggingInterceptor()

        interceptor.level = HttpLoggingInterceptor.Level.BODY
        return OkHttpClient.Builder()
            .addInterceptor(interceptor)
            .build()
    }
}
package com.juanpablotomas.listingtestapp.ui

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.juanpablotomas.listingtestapp.domain.entities.Article
import com.juanpablotomas.listingtestapp.domain.usecases.articles.ArticlesUseCaseInterface
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ArticlesListScreenViewModel @Inject constructor(
    private val articlesUseCase: ArticlesUseCaseInterface
) : ViewModel() {
    private val _newsList = MutableStateFlow(listOf<Article>())
    val newsList = _newsList.asStateFlow()

    init {
        viewModelScope.launch {
            _newsList.value = articlesUseCase.getAllArticles()
        }
    }
}
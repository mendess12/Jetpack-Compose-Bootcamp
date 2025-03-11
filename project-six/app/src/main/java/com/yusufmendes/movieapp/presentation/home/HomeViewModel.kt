package com.yusufmendes.movieapp.presentation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yusufmendes.movieapp.data.model.Movies
import com.yusufmendes.movieapp.data.repo.MoviesRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val moviesRepository: MoviesRepository
) : ViewModel() {

    var movieList = MutableLiveData<List<Movies>>()

    init {
        getMovieList()
    }

    fun getMovieList() {
        CoroutineScope(Dispatchers.Main).launch {
            val result = moviesRepository.getMovieList()
            movieList.value = result
        }
    }
}
package com.yusufmendes.movieapp.data.repo

import com.yusufmendes.movieapp.data.model.Movies
import com.yusufmendes.movieapp.data.source.MoviesDataSource
import javax.inject.Inject

class MoviesRepository @Inject constructor(
    private val moviesDataSource : MoviesDataSource
){

    suspend fun getMovieList(): List<Movies> = moviesDataSource.getMovieList()
}
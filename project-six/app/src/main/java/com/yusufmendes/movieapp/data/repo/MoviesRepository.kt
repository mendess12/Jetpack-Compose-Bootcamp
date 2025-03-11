package com.yusufmendes.movieapp.data.repo

import com.yusufmendes.movieapp.data.model.Movies
import com.yusufmendes.movieapp.data.source.MoviesDataSource

class MoviesRepository {

    private val moviesDataSource = MoviesDataSource()

    suspend fun getMovieList(): List<Movies> = moviesDataSource.getMovieList()
}
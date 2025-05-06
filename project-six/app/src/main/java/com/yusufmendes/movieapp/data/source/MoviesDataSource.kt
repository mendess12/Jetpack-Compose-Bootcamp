package com.yusufmendes.movieapp.data.source

import com.yusufmendes.movieapp.data.model.Movies
import com.yusufmendes.movieapp.room.MovieDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource(val movieDao: MovieDao) {

    suspend fun getMovieList(): List<Movies> = withContext(Dispatchers.IO) {

        return@withContext movieDao.getMovieList()
    }
}
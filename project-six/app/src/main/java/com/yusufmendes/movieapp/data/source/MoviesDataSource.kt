package com.yusufmendes.movieapp.data.source

import com.yusufmendes.movieapp.data.model.Movies
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MoviesDataSource {

    suspend fun getMovieList(): List<Movies> = withContext(Dispatchers.IO) {

        val movieList = ArrayList<Movies>()

        val movie1 = Movies(1, "Django", "django", 24)
        val movie2 = Movies(1, "Interstellar", "interstellar", 32)
        val movie3 = Movies(1, "Inception", "inception", 16)
        val movie4 = Movies(1, "The Hateful Eight", "thehatefuleight", 28)
        val movie5 = Movies(1, "The Pianist", "thepianist", 18)
        val movie6 = Movies(1, "Anadoluda", "anadoluda", 10)
        movieList.add(movie1)
        movieList.add(movie2)
        movieList.add(movie3)
        movieList.add(movie4)
        movieList.add(movie5)
        movieList.add(movie6)

        return@withContext movieList
    }
}
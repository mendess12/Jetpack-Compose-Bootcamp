package com.yusufmendes.movieapp.room

import androidx.room.Dao
import androidx.room.Query
import com.yusufmendes.movieapp.data.model.Movies

@Dao
interface MovieDao {

    @Query("SELECT * FROM filmler")
    suspend fun getMovieList(): List<Movies>
}
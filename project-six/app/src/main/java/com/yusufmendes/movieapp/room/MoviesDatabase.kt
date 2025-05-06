package com.yusufmendes.movieapp.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yusufmendes.movieapp.data.model.Movies

@Database(entities = [Movies::class], version = 1)
abstract class MoviesDatabase : RoomDatabase() {

    abstract fun getMovieDao(): MovieDao
}
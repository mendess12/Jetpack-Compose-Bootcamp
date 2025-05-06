package com.yusufmendes.movieapp.domain.di

import android.content.Context
import androidx.room.Room
import com.yusufmendes.movieapp.data.repo.MoviesRepository
import com.yusufmendes.movieapp.data.source.MoviesDataSource
import com.yusufmendes.movieapp.room.MovieDao
import com.yusufmendes.movieapp.room.MoviesDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviesAppModule {

    @Provides
    @Singleton
    fun providesMoviesDataSource(movieDao: MovieDao): MoviesDataSource = MoviesDataSource(movieDao)

    @Provides
    @Singleton
    fun provideMoviesRepository(moviesDataSource: MoviesDataSource): MoviesRepository =
        MoviesRepository(moviesDataSource)

    @Provides
    @Singleton
    fun provideMovieDao(@ApplicationContext context : Context) : MovieDao{
        val movieDatabase = Room.databaseBuilder(context, MoviesDatabase::class.java ,"filmler_app.sqlite")
            .createFromAsset("filmler_app.sqlite").build()
        return movieDatabase.getMovieDao()
    }
}
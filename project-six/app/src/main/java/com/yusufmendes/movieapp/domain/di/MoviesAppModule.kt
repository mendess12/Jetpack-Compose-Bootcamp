package com.yusufmendes.movieapp.domain.di

import com.yusufmendes.movieapp.data.repo.MoviesRepository
import com.yusufmendes.movieapp.data.source.MoviesDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object MoviesAppModule {

    @Provides
    @Singleton
    fun providesMoviesDataSource(): MoviesDataSource = MoviesDataSource()

    @Provides
    @Singleton
    fun provideMoviesRepository(moviesDataSource: MoviesDataSource): MoviesRepository =
        MoviesRepository(moviesDataSource)
}
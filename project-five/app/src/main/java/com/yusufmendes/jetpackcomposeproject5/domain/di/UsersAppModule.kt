package com.yusufmendes.jetpackcomposeproject5.domain.di

import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import com.yusufmendes.jetpackcomposeproject5.data.resource.UsersDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UsersAppModule {

    @Provides
    @Singleton
    fun providesUserDataSource(): UsersDataSource = UsersDataSource()

    @Provides
    @Singleton
    fun provideUserRepository(usersDataSource: UsersDataSource): UsersRepository =
        UsersRepository(usersDataSource)
}
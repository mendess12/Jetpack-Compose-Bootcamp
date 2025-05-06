package com.yusufmendes.jetpackcomposeproject5.domain.di

import android.content.Context
import androidx.room.Room
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import com.yusufmendes.jetpackcomposeproject5.data.resource.UsersDataSource
import com.yusufmendes.jetpackcomposeproject5.room.UsersDao
import com.yusufmendes.jetpackcomposeproject5.room.UsersDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object UsersAppModule {

    @Provides
    @Singleton
    fun providesUserDataSource(usersDao: UsersDao): UsersDataSource = UsersDataSource(usersDao)

    @Provides
    @Singleton
    fun provideUserRepository(usersDataSource: UsersDataSource): UsersRepository =
        UsersRepository(usersDataSource)

    @Provides
    @Singleton
    fun provideUserDao(@ApplicationContext context: Context): UsersDao {
        val userDatabase = Room.databaseBuilder(context, UsersDatabase::class.java, "users.sqlite")
            .createFromAsset("users.sqlite").build()
        return userDatabase.getUsersDao()
    }
}
package com.yusufmendes.jetpackcomposeproject5.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.yusufmendes.jetpackcomposeproject5.data.model.Users

@Database(entities = [Users::class], version = 1)
abstract class UsersDatabase : RoomDatabase() {

    abstract fun getUsersDao(): UsersDao

}
package com.yusufmendes.jetpackcomposeproject5.data.resource

import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import com.yusufmendes.jetpackcomposeproject5.room.UsersDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UsersDataSource(val userDao: UsersDao) {

    suspend fun addUser(name: String, phone: String) {
        val newUser = Users(0, name, phone)
        userDao.addUser(newUser)
    }

    suspend fun updateUser(userId: Int, userName: String, userPhone: String) {
        val user = Users(userId, userName, userPhone)
        userDao.updateUser(user)
    }

    suspend fun deleteUser(userId: Int) = withContext(Dispatchers.IO) {
        //delete user
    }

    suspend fun getUserList(): List<Users> = withContext(Dispatchers.IO) {

        return@withContext userDao.loadUsers()
    }

    suspend fun searchUser(search: String): List<Users> = withContext(Dispatchers.IO) {

        return@withContext userDao.searchUser(search)
    }
}
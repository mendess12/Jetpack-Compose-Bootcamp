package com.yusufmendes.jetpackcomposeproject5.data.resource

import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import com.yusufmendes.jetpackcomposeproject5.room.UsersDao
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UsersDataSource(val userDao: UsersDao) {

    suspend fun addUser(name: String, phone: String): Unit =
        withContext(Dispatchers.IO) {
            //add user
        }

    suspend fun updateUser(userId: Int, userName: String, userPhone: String) =
        withContext(Dispatchers.IO) {
            //update user function
        }

    suspend fun deleteUser(userId: Int) = withContext(Dispatchers.IO) {
        //delete user
    }

    suspend fun getUserList(): List<Users> = withContext(Dispatchers.IO) {

        return@withContext userDao.loadUsers()
    }

    suspend fun searchUser(search: String): List<Users> = withContext(Dispatchers.IO) {
        val userList = ArrayList<Users>()

        val user1 = Users(1, "Yusuf", "111111")
        userList.add(user1)

        return@withContext userList
    }
}
package com.yusufmendes.jetpackcomposeproject5.data.resource

import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class UsersDataSource {

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

        val userList = ArrayList<Users>()

        val user1 = Users(1, "Yusuf", "111111")
        val user2 = Users(1, "Ahmet", "222222")
        val user3 = Users(1, "Merve", "333333")
        val user4 = Users(1, "Sevda", "444444")

        userList.add(user1)
        userList.add(user2)
        userList.add(user3)
        userList.add(user4)

        return@withContext userList
    }
}
package com.yusufmendes.jetpackcomposeproject5.data.resource

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

    suspend fun deleteUser(userId: Int) = withContext(Dispatchers.IO){
        //delete user
    }
}
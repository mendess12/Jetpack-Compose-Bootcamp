package com.yusufmendes.jetpackcomposeproject5.data.repo

import com.yusufmendes.jetpackcomposeproject5.data.resource.UsersDataSource

class UsersRepository {

    private val usersDataSource = UsersDataSource()

    suspend fun addUsers(name: String, phone: String) = usersDataSource.addUser(name, phone)

    suspend fun updateUser(userId: Int, userName: String, userPhone: String) =
        usersDataSource.updateUser(userId, userName, userPhone)
}
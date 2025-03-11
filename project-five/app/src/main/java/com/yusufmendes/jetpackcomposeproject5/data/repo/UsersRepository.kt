package com.yusufmendes.jetpackcomposeproject5.data.repo

import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import com.yusufmendes.jetpackcomposeproject5.data.resource.UsersDataSource
import javax.inject.Inject

class UsersRepository @Inject constructor(
    private val usersDataSource: UsersDataSource
) {

    suspend fun addUsers(name: String, phone: String) = usersDataSource.addUser(name, phone)

    suspend fun updateUser(userId: Int, userName: String, userPhone: String) =
        usersDataSource.updateUser(userId, userName, userPhone)

    suspend fun deleteUser(userId: Int) = usersDataSource.deleteUser(userId)

    suspend fun getUserList(): List<Users> = usersDataSource.getUserList()

    suspend fun searchUser(search: String): List<Users> = usersDataSource.searchUser(search)
}
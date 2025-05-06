package com.yusufmendes.jetpackcomposeproject5.room

import androidx.room.Dao
import androidx.room.Query
import com.yusufmendes.jetpackcomposeproject5.data.model.Users

@Dao
interface UsersDao {

    @Query("SELECT * FROM kisiler")
    suspend fun loadUsers(): List<Users>

    @Query("SELECT * FROM kisiler WHERE kisi_ad like '%' || :searchWord || '%'")
    suspend fun searchUser(searchWord: String): List<Users>
}
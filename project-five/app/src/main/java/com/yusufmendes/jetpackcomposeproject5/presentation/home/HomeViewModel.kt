package com.yusufmendes.jetpackcomposeproject5.presentation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val usersRepository = UsersRepository()
    var userList = MutableLiveData<List<Users>>()

    fun deleteUser(userId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            usersRepository.deleteUser(userId)
        }
    }

    fun getUserList() {
        CoroutineScope(Dispatchers.Main).launch {
            val result = usersRepository.getUserList()
            userList.value = result
        }
    }
}
package com.yusufmendes.jetpackcomposeproject5.presentation.home

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(
    private val usersRepository: UsersRepository
) : ViewModel() {

    var userList = MutableLiveData<List<Users>>()

    init {
        getUserList()
    }

    fun deleteUser(userId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            usersRepository.deleteUser(userId)
            getUserList()
        }
    }

    fun getUserList() {
        CoroutineScope(Dispatchers.Main).launch {
            val result = usersRepository.getUserList()
            userList.value = result
        }
    }

    fun searchUser(search: String) {
        CoroutineScope(Dispatchers.Main).launch {
            val result = usersRepository.searchUser(search)
            userList.value = result
        }
    }
}
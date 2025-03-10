package com.yusufmendes.jetpackcomposeproject5.presentation.add

import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class AddUserViewModel : ViewModel() {

    private val usersRepository = UsersRepository()

    fun addUser(name: String, phone: String) {
        CoroutineScope(Dispatchers.Main).launch {
            usersRepository.addUsers(name, phone)
        }
    }
}
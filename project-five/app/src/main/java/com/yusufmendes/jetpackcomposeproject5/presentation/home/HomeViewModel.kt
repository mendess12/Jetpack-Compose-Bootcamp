package com.yusufmendes.jetpackcomposeproject5.presentation.home

import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    private val usersRepository = UsersRepository()

    fun deleteUser(userId: Int) {
        CoroutineScope(Dispatchers.Main).launch {
            usersRepository.deleteUser(userId)
        }
    }
}
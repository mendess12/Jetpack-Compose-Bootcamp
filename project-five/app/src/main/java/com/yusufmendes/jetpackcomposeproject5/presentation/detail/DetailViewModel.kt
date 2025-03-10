package com.yusufmendes.jetpackcomposeproject5.presentation.detail

import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class DetailViewModel : ViewModel() {

    private val usersRepository = UsersRepository()

    fun updateUser(userId: Int, userName: String, userPhone: String) {
        CoroutineScope(Dispatchers.Main).launch {
            usersRepository.updateUser(userId, userName, userPhone)
        }
    }

}
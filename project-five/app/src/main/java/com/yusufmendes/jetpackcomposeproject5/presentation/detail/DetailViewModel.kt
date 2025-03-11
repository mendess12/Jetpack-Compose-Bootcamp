package com.yusufmendes.jetpackcomposeproject5.presentation.detail

import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject5.data.repo.UsersRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class DetailViewModel @Inject constructor(
    private val usersRepository: UsersRepository
) : ViewModel() {

    fun updateUser(userId: Int, userName: String, userPhone: String) {
        CoroutineScope(Dispatchers.Main).launch {
            usersRepository.updateUser(userId, userName, userPhone)
        }
    }

}
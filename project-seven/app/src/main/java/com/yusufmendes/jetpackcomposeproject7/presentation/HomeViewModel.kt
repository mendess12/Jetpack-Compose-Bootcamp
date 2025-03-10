package com.yusufmendes.jetpackcomposeproject7.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.yusufmendes.jetpackcomposeproject7.data.MathRepository
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class HomeViewModel : ViewModel() {

    var result = MutableLiveData("")
    private val mathRepository = MathRepository()

    fun sub(setNumber1: String, setNumber2: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mathRepository.sub(setNumber1, setNumber2)
        }
    }

    fun multi(setNumber1: String, setNumber2: String) {
        CoroutineScope(Dispatchers.Main).launch {
            result.value = mathRepository.multi(setNumber1, setNumber2)
        }
    }
}
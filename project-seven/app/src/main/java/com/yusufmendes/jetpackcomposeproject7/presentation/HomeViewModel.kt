package com.yusufmendes.jetpackcomposeproject7.presentation

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var result = MutableLiveData("")

    fun sub(setNumber1: String, setNumber2: String) {
        val number1 = setNumber1.toInt()
        val number2 = setNumber2.toInt()

        val sub = number1 + number2
        result.value = sub.toString()
    }

    fun multi(setNumber1: String, setNumber2: String) {
        val number1 = setNumber1.toInt()
        val number2 = setNumber2.toInt()

        val multi = number1 * number2
        result.value  = multi.toString()
    }
}
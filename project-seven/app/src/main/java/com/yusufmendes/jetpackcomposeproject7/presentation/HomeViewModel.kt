package com.yusufmendes.jetpackcomposeproject7.presentation

import androidx.lifecycle.ViewModel

class HomeViewModel : ViewModel() {

    var result = "0"

    fun sub(setNumber1: String, setNumber2: String) {
        val number1 = setNumber1.toInt()
        val number2 = setNumber2.toInt()

        val sub = number1 + number2
        result = sub.toString()
    }

    fun multi(setNumber1: String, setNumber2: String) {
        val number1 = setNumber1.toInt()
        val number2 = setNumber2.toInt()

        val multi = number1 * number2
        result = multi.toString()
    }
}
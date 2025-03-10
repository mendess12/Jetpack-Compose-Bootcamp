package com.yusufmendes.jetpackcomposeproject7.data

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MathDataSource {

    suspend fun sub(setNumber1: String, setNumber2: String): String =
        withContext(Dispatchers.IO) {
            val number1 = setNumber1.toInt()
            val number2 = setNumber2.toInt()

            val sub = number1 + number2
            return@withContext sub.toString()
        }

    suspend fun multi(setNumber1: String, setNumber2: String): String =
        withContext(Dispatchers.IO) {
            val number1 = setNumber1.toInt()
            val number2 = setNumber2.toInt()

            val multi = number1 * number2
            return@withContext multi.toString()
        }
}
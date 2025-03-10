package com.yusufmendes.jetpackcomposeproject7.data

class MathRepository {

    private  val mathDataSource = MathDataSource()

    suspend fun sub(setNumber1: String, setNumber2: String) =
        mathDataSource.sub(setNumber1, setNumber2)

    suspend fun multi(setNumber1: String, setNumber2: String) =
        mathDataSource.multi(setNumber1, setNumber2)
}
package com.yusufmendes.movieapp.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "filmler")
data class Movies(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "ad") val ad: String,
    @ColumnInfo(name = "resim") val resim: String,
    @ColumnInfo(name = "fiyat") val fiyat: Int
)

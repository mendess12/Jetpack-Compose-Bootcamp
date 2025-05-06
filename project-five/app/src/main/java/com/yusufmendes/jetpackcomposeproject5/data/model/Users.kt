package com.yusufmendes.jetpackcomposeproject5.data.model

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "kisiler")
data class Users(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "kisi_id")  val kisi_id: Int,
    @ColumnInfo(name = "kisi_ad")  val kisi_ad: String,
    @ColumnInfo(name = "kisi_tel")  val kisi_tel: String
)

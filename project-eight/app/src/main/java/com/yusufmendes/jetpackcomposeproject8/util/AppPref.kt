package com.yusufmendes.jetpackcomposeproject8.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.booleanPreferencesKey
import androidx.datastore.preferences.core.doublePreferencesKey
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.intPreferencesKey
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.core.stringSetPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class AppPref(val context: Context) {

    val Context.dataStore: DataStore<Preferences> by preferencesDataStore("info")

    companion object {
        val NAME_KEY = stringPreferencesKey("NAME")
        val AGE_KEY = intPreferencesKey("AGE")
        val HEIGHT_KEY = doublePreferencesKey("HEIGHT")
        val MARRY_KEY = booleanPreferencesKey("MARRY")
        val LIST_KEY = stringSetPreferencesKey("LIST")
        val COUNT_KEY = intPreferencesKey("COUNT")
    }

    suspend fun saveName(name: String) {
        context.dataStore.edit {
            it[NAME_KEY] = name
        }
    }

    suspend fun readName(): String {
        val name = context.dataStore.data.first()
        return name[NAME_KEY] ?: "İsim yok"
    }

    suspend fun deleteName() {
        context.dataStore.edit {
            it.remove(NAME_KEY)
        }
    }

    suspend fun saveAge(age: Int) {
        context.dataStore.edit {
            it[AGE_KEY] = age
        }
    }

    suspend fun readAge(): Int {
        val age = context.dataStore.data.first()
        return age[AGE_KEY] ?: 0
    }

    suspend fun deleteAge() {
        context.dataStore.edit {
            it.remove(AGE_KEY)
        }
    }

    suspend fun saveHeight(height: Double) {
        context.dataStore.edit {
            it[HEIGHT_KEY] = height
        }
    }

    suspend fun readHeight(): Double {
        val height = context.dataStore.data.first()
        return height[HEIGHT_KEY] ?: 0.0
    }

    suspend fun deleteHeight() {
        context.dataStore.edit {
            it.remove(HEIGHT_KEY)
        }
    }

    suspend fun saveMarry(marry: Boolean) {
        context.dataStore.edit {
            it[MARRY_KEY] = marry
        }
    }

    suspend fun readMarry(): Boolean {
        val marry = context.dataStore.data.first()
        return marry[MARRY_KEY] ?: false
    }

    suspend fun deleteMarry() {
        context.dataStore.edit {
            it.remove(MARRY_KEY)
        }
    }

    suspend fun saveList(list: Set<String>) {
        context.dataStore.edit {
            it[LIST_KEY] = list
        }
    }

    suspend fun readList(): Set<String>? {
        val list = context.dataStore.data.first()
        return list[LIST_KEY]
    }

    suspend fun deleteList() {
        context.dataStore.edit {
            it.remove(LIST_KEY)
        }
    }

    suspend fun saveCount(count: Int) {
        context.dataStore.edit {
            it[COUNT_KEY] = count
        }
    }

    suspend fun readCount(): Int {
        val count = context.dataStore.data.first()
        return count[COUNT_KEY] ?: 0
    }

    suspend fun deleteCount() {
        context.dataStore.edit {
            it.remove(COUNT_KEY )
        }
    }

}
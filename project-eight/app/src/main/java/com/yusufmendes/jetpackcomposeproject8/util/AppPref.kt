package com.yusufmendes.jetpackcomposeproject8.util

import android.content.Context
import androidx.datastore.core.DataStore
import androidx.datastore.preferences.core.Preferences
import androidx.datastore.preferences.core.edit
import androidx.datastore.preferences.core.stringPreferencesKey
import androidx.datastore.preferences.preferencesDataStore
import kotlinx.coroutines.flow.first

class AppPref(val context: Context) {

    val Context.dataStore: DataStore<Preferences> by preferencesDataStore("info")

    companion object {
        val NAME_KEY = stringPreferencesKey("NAME")
    }

    suspend fun saveName(name: String) {
        context.dataStore.edit {
            it[NAME_KEY] = name
        }
    }

    suspend fun readName(): String {
        val p = context.dataStore.data.first()
        return p[NAME_KEY] ?: "İsim yok"
    }

    suspend fun deleteName() {
        context.dataStore.edit {
            it.remove(NAME_KEY)
        }
    }
}
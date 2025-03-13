package com.yusufmendes.jetpackcomposeproject8.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposeproject8.util.AppPref
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {

    val context = LocalContext.current
    val appPref = AppPref(context)

    LaunchedEffect(key1 = true) {

        CoroutineScope(Dispatchers.Main).launch {
            //save
            appPref.saveName("Yusuf")

            //delete
            appPref.deleteName()

            //read
            val getName = appPref.readName()
            Log.e("Gelen isim", getName)
        }

    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Açılış sayısı ", fontSize = 30.sp)
    }
}
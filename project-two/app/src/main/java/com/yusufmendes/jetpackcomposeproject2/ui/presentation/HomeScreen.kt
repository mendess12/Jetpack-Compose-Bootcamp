package com.yusufmendes.jetpackcomposeproject2.ui.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.DisposableEffect
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.google.gson.Gson
import com.yusufmendes.jetpackcomposeproject2.data.model.Products

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    val count = remember { mutableStateOf(0) }

    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Home") })
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(text = "Count : ${count.value}")
            Button(onClick = {
                count.value += 1
            }) {
                Text(text = "Click")
            }

            Button(onClick = {
                //object to json
                val product = Products(100, "Phone")
                val jsonProduct = Gson().toJson(product)
                navController.navigate("detailScreen/Yusuf/24/1.78f/false/$jsonProduct") {
                    //back stack'ten silme işlemi
                    popUpTo("homeScreen") { inclusive = true }
                }
            }) {
                Text(text = "Go to Detail Screen")
            }
        }
    }

    //Lifecycle
    //LaunchedEffect -> Sayfa her göründüğünde çalışır. Sayfaya geri dönüldüğünü takip etmek için kullanılabilir.
    //DisposableEffect -> Sayfa her görünmez olduğunda çalışır.

    LaunchedEffect(key1 = true) {
        Log.e("HomeScreen", "LaunchedEffect run")
    }

    DisposableEffect(Unit) {
        onDispose {
            Log.e("HomeScreen", "DisposableEffect run")
        }
    }
}
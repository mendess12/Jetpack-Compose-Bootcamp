package com.yusufmendes.jetpackcomposeproject2.ui.presentation

import android.util.Log
import androidx.activity.compose.BackHandler
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.yusufmendes.jetpackcomposeproject2.data.model.Products

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(
    navController: NavController,
    name: String,
    age: Int,
    height: Float,
    isMarried: Boolean,
    product: Products
) {
    Scaffold(topBar = {
        TopAppBar(
            title = { Text(text = "Detail") })
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            //Text(text = "Hello Jetpack Compose")
            Text(text = "$name - $age - $height - $isMarried - ${product.id} - ${product.name}")
        }
    }

    //enabled : true ise geri dönüş aktif değil ve kod bloku içindeki kodlar çalışır
    //enabled : false ise geri dönüş aktif ve kod bloku içindeki kodlar çalışmaz sadece bir önceki sayfaya gider.
    BackHandler(false) {
        Log.e("Detail Screen", "Back handler run")
    }
}
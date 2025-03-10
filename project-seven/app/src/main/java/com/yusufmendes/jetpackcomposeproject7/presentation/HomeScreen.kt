package com.yusufmendes.jetpackcomposeproject7.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val tfNumber1 = remember { mutableStateOf("") }
    val tfNumber2 = remember { mutableStateOf("") }
    val result = remember { mutableStateOf("0") }

    Scaffold(
        topBar = {
            TopAppBar(
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = Color.Green,
                    titleContentColor = Color.Black
                ),
                modifier = Modifier.fillMaxWidth(),
                title = {
                    Text(
                        text = "MVVM Kullanımı",
                        fontSize = 24.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Italic
                    )
                })
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = result.value,
                fontSize = 40.sp,
                fontFamily = FontFamily.SansSerif,
                fontStyle = FontStyle.Italic
            )

            TextField(
                value = tfNumber1.value,
                onValueChange = { tfNumber1.value = it },
                label = { Text(text = "Sayi 1") }
            )

            TextField(
                value = tfNumber2.value,
                onValueChange = { tfNumber2.value = it },
                label = { Text(text = "Sayi 2") }
            )

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Button(onClick = {
                    val setNumber1 = tfNumber1.value
                    val setNumber2 = tfNumber2.value

                    val number1 = setNumber1.toInt()
                    val number2 = setNumber2.toInt()

                    val sub = number1 + number2
                    result.value = sub.toString()
                }) {
                    Text(text = "Toplama")
                }

                Button(onClick = {
                    val setNumber1 = tfNumber1.value
                    val setNumber2 = tfNumber2.value

                    val number1 = setNumber1.toInt()
                    val number2 = setNumber2.toInt()

                    val multi = number1 * number2
                    result.value = multi.toString()
                }) {
                    Text(text = "Çarpma")
                }
            }
        }
    }
}
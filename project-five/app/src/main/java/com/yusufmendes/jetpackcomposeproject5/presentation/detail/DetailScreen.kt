package com.yusufmendes.jetpackcomposeproject5.presentation.detail

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposeproject5.data.model.Users

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DetailScreen(user: Users) {

    val userName = remember { mutableStateOf("") }
    val userPhone = remember { mutableStateOf("") }

    LaunchedEffect(true) {
        userName.value = user.kisi_ad
        userPhone.value = user.kisi_tel
    }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.LightGray,
                titleContentColor = Color.Black
            ),
            title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "User Detail",
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Italic,
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            TextField(
                modifier = Modifier.padding(16.dp),
                value = userName.value,
                onValueChange = { userName.value = it },
                label = {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(2.dp),
                        text = "User Name",
                        fontStyle = FontStyle.Italic,
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text)
            )

            TextField(
                modifier = Modifier.padding(16.dp),
                value = userPhone.value,
                onValueChange = { userPhone.value = it },
                label = {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(2.dp),
                        text = "User Phone",
                        fontStyle = FontStyle.Italic,
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )

            Button(
                modifier = Modifier.size(250.dp, 50.dp),
                onClick = {
                    updateUser(
                        userId = user.kisi_id.toString(),
                        userName = userName.value,
                        userPhone = userPhone.value
                    )
                }, colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.LightGray
                )
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Update",
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Italic,
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        }
    }
}

fun updateUser(userId: String, userName: String, userPhone: String) {
    //save user function
}
package com.yusufmendes.jetpackcomposeproject5.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.gson.Gson
import com.yusufmendes.jetpackcomposeproject5.R
import com.yusufmendes.jetpackcomposeproject5.data.model.Users
import com.yusufmendes.jetpackcomposeproject5.presentation.detail.updateUser

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController
) {

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.LightGray,
                titleContentColor = Color.Black
            ),
            title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Home",
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Italic,
                    fontSize = 30.sp,
                    color = Color.Black
                )
            }
        )
    },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("addUserScreen")
                },
                content = {
                    Image(
                        painter = painterResource(R.drawable.add_icon),
                        contentDescription = ""
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

            Button(
                modifier = Modifier.size(250.dp, 50.dp),
                onClick = {
                    val user = Users(1, "Yusuf Mendes", "1111111")
                    val userJson = Gson().toJson(user)
                    navController.navigate("detailScreen/$userJson")
                }, colors = ButtonDefaults.buttonColors(
                    contentColor = Color.Black,
                    containerColor = Color.LightGray
                )
            ) {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Detail",
                    textAlign = TextAlign.Center,
                    fontStyle = FontStyle.Italic,
                    fontSize = 20.sp,
                    color = Color.Black
                )
            }
        }

    }
}
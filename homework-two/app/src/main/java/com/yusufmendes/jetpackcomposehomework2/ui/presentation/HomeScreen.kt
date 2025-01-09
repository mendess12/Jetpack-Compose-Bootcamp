package com.yusufmendes.jetpackcomposehomework2.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposehomework2.R
import com.yusufmendes.jetpackcomposehomework2.ui.theme.homeScreenBackground
import com.yusufmendes.jetpackcomposehomework2.ui.theme.homeScreenTopBarBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = homeScreenTopBarBackground,
                titleContentColor = Color.Black
            ),
            title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.home_title),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.Serif,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center
                )
            }
        )
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(homeScreenBackground),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {

            Text(text = stringResource(R.string.home_message), fontSize = 16.sp)

            Spacer(modifier = Modifier.padding(0.dp, 24.dp, 0.dp, 24.dp))

            Button(
                onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Blue,
                    contentColor = Color.White
                )
            ) {
                Text(text = stringResource(R.string.home_button_one), fontSize = 20.sp)
            }

            Button(
                onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = Color.Magenta,
                    contentColor = Color.White
                )
            ) {
                Text(text = stringResource(R.string.home_button_two), fontSize = 20.sp)
            }

        }
    }
}
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
import com.yusufmendes.jetpackcomposehomework2.ui.theme.aScreenBackground
import com.yusufmendes.jetpackcomposehomework2.ui.theme.aScreenTopBarBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AScreen() {

    Scaffold(
        topBar = {
            TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = aScreenTopBarBackground,
                titleContentColor = Color.Black
            ), title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.a_screen_title),
                    fontSize = 30.sp,
                    fontFamily = FontFamily.SansSerif,
                    fontStyle = FontStyle.Italic,
                    textAlign = TextAlign.Center
                )
            })
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(aScreenBackground),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            Text(text = stringResource(R.string.a_screen_message), fontSize = 16.sp)

            Spacer(modifier = Modifier.padding(0.dp, 24.dp, 0.dp, 24.dp))

            Button(
                onClick = {}, colors = ButtonDefaults.buttonColors(
                    containerColor = aScreenTopBarBackground,
                    contentColor = Color.White
                )
            ) {
                Text(text = stringResource(R.string.a_screen_button), fontSize = 20.sp)
            }
        }
    }
}
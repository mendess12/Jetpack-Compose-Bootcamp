package com.yusufmendes.jetpackcomposehomework2.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
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
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposehomework2.R
import com.yusufmendes.jetpackcomposehomework2.ui.theme.yScreenBackground
import com.yusufmendes.jetpackcomposehomework2.ui.theme.yScreenTopBarBackground

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun YScreen() {

    Scaffold(
        topBar = {
            TopAppBar(colors = TopAppBarDefaults.topAppBarColors(
                containerColor = yScreenTopBarBackground,
                titleContentColor = Color.Black
            ), title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.y_screen_title),
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
                .background(yScreenBackground),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceEvenly
        ) {

            Text(text = stringResource(R.string.y_screen_message), fontSize = 16.sp)

        }
    }
}
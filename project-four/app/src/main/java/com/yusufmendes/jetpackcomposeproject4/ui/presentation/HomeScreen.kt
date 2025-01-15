package com.yusufmendes.jetpackcomposeproject4.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposeproject4.ui.theme.BackgroundColor
import com.yusufmendes.jetpackcomposeproject4.ui.theme.TextColor
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = BackgroundColor,
                titleContentColor = TextColor
            ),
            title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = "Home",
                    color = TextColor,
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontStyle = FontStyle.Italic
                )
            })
    },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState) {
                Snackbar(
                    contentColor = TextColor,
                    containerColor = BackgroundColor,
                    actionColor = Color.Red,
                    snackbarData = it
                )
            }
        }
    ) { paddingValues ->

        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Button(onClick = {
                scope.launch {
                    val snackbar = snackbarHostState.showSnackbar(
                        message = "Do you want to delete ?",
                        actionLabel = "Yes"
                    )
                    if (snackbar == SnackbarResult.ActionPerformed) {
                        snackbarHostState.showSnackbar(message = "Deleted")
                    }
                }
            }) {
                Text(text = "Show Snackbar")
            }
            Button(onClick = {

            }) {
                Text(text = "Show Alert Dialog")
            }
        }
    }
}
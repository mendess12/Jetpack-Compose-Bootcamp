package com.yusufmendes.jetpackcomposeproject2.ui.presentation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import com.yusufmendes.jetpackcomposeproject2.R
import com.yusufmendes.jetpackcomposeproject2.ui.navigate.NavigateToScreen

@Composable
fun BottomBarScreen() {
    val selectedItem = remember { mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            BottomAppBar(content = {
                NavigationBarItem(
                    selected = selectedItem.value == 0,
                    onClick = { selectedItem.value = 0 },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.home_icon),
                            contentDescription = ""
                        )
                    },
                    label = { Text(text = "Home") }
                )
                NavigationBarItem(
                    selected = selectedItem.value == 1,
                    onClick = { selectedItem.value = 1 },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.settings_icon),
                            contentDescription = ""
                        )
                    },
                    label = { Text(text = "Settings") }
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
            if (selectedItem.value == 0) NavigateToScreen(selectScreen = "homeScreen")
            if (selectedItem.value == 1) NavigateToScreen(selectScreen = "settingsScreen")
        }
    }
}
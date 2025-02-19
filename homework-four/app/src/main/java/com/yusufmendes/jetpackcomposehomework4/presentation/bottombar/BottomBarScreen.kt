package com.yusufmendes.jetpackcomposehomework4.presentation.bottombar

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import com.yusufmendes.jetpackcomposehomework4.R
import com.yusufmendes.jetpackcomposehomework4.navigation.NavigateToScreen
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor


@Composable
fun BottomBarScreen() {
    val selectedItem = remember { mutableStateOf(0) }
    Scaffold(
        bottomBar = {
            BottomAppBar(containerColor = Color.White, content = {
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = topBarColor,
                        unselectedIconColor = Color.Gray,
                        indicatorColor = Color.White
                    ),
                    selected = selectedItem.value == 0,
                    onClick = { selectedItem.value = 0 },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.home_icon),
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = topBarColor,
                        unselectedIconColor = Color.Gray,
                        indicatorColor = Color.White
                    ),
                    selected = selectedItem.value == 1,
                    onClick = { selectedItem.value = 1 },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.search_icon),
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = topBarColor,
                        unselectedIconColor = Color.Gray,
                        indicatorColor = Color.White
                    ),
                    selected = selectedItem.value == 2,
                    onClick = { selectedItem.value = 2 },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.profile_icon),
                            contentDescription = ""
                        )
                    }
                )
                NavigationBarItem(
                    colors = NavigationBarItemDefaults.colors(
                        selectedIconColor = topBarColor,
                        unselectedIconColor = Color.Gray,
                        indicatorColor = Color.White
                    ),
                    selected = selectedItem.value == 3,
                    onClick = { selectedItem.value = 3 },
                    icon = {
                        Icon(
                            painter = painterResource(id = R.drawable.favorite_icon),
                            contentDescription = ""
                        )
                    }
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
            if (selectedItem.value == 1) NavigateToScreen(selectScreen = "searchScreen")
            if (selectedItem.value == 2) NavigateToScreen(selectScreen = "profileScreen")
            if (selectedItem.value == 3) NavigateToScreen(selectScreen = "favoritesScreen")
        }
    }
}
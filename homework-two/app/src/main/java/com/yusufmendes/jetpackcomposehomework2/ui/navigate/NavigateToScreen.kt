package com.yusufmendes.jetpackcomposehomework2.ui.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusufmendes.jetpackcomposehomework2.ui.presentation.AScreen
import com.yusufmendes.jetpackcomposehomework2.ui.presentation.BScreen
import com.yusufmendes.jetpackcomposehomework2.ui.presentation.HomeScreen
import com.yusufmendes.jetpackcomposehomework2.ui.presentation.XScreen
import com.yusufmendes.jetpackcomposehomework2.ui.presentation.YScreen

@Composable
fun NavigateToScreen() {

    //create navController
    val navController = rememberNavController()

    //create navHost. Give the navController and startDestination parameters
    //start destination : first screen the open
    NavHost(
        navController = navController,
        startDestination = "homeScreen"
    ) {
        composable("homeScreen") {
            HomeScreen(navController = navController)
        }

        composable("aScreen") {
            AScreen(navController = navController)
        }

        composable("bScreen") {
            BScreen(navController = navController)
        }

        composable("xScreen") {
            XScreen(navController = navController)
        }

        composable("yScreen") {
            YScreen(navController = navController)
        }
    }
}
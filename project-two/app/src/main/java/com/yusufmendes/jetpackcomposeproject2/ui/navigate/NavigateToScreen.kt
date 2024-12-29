package com.yusufmendes.jetpackcomposeproject2.ui.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusufmendes.jetpackcomposeproject2.ui.presentation.DetailScreen
import com.yusufmendes.jetpackcomposeproject2.ui.presentation.HomeScreen

@Composable
fun NavigateToScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") {
            HomeScreen(navController = navController)
        }

        composable("detailScreen") {
            DetailScreen(navController = navController)
        }
    }
}
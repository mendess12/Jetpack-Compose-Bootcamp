package com.yusufmendes.movieapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusufmendes.movieapp.presentation.detail.DetailScreen
import com.yusufmendes.movieapp.presentation.home.HomeScreen

@Composable
fun NavigateToScreen() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") {
            HomeScreen(navController = navController)
        }

        composable("detailScreen") {
            DetailScreen()
        }
    }
}
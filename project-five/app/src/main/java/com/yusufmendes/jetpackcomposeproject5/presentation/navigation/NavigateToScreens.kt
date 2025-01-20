package com.yusufmendes.jetpackcomposeproject5.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusufmendes.jetpackcomposeproject5.presentation.add.AddUserScreen
import com.yusufmendes.jetpackcomposeproject5.presentation.detail.DetailScreen
import com.yusufmendes.jetpackcomposeproject5.presentation.home.HomeScreen

@Composable
fun NavigateToScreen() {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homeScreen") {
        composable(route = "homeScreen") {
            HomeScreen(navController = navController)
        }

        composable(route = "detailScreen") {
            DetailScreen()
        }

        composable(route = "addUserScreen") {
            AddUserScreen()
        }
    }

}
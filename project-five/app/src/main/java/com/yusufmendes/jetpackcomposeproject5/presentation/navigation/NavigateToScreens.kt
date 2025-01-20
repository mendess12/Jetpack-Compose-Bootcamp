package com.yusufmendes.jetpackcomposeproject5.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.yusufmendes.jetpackcomposeproject5.data.model.Users
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

        composable(route = "detailScreen/{user}",
            arguments = listOf(
                navArgument("user") {
                    type = NavType.StringType
                }
            )
        ) {
            val jsonUser = it.arguments?.getString("user")
            val user = Gson().fromJson(jsonUser, Users::class.java)
            DetailScreen(user)
        }

        composable(route = "addUserScreen") {
            AddUserScreen()
        }
    }

}
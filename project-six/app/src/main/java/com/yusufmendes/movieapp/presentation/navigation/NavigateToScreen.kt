package com.yusufmendes.movieapp.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.yusufmendes.movieapp.data.model.Movies
import com.yusufmendes.movieapp.presentation.detail.DetailScreen
import com.yusufmendes.movieapp.presentation.home.HomeScreen
import com.yusufmendes.movieapp.presentation.home.HomeViewModel

@Composable
fun NavigateToScreen(
    homeViewModel: HomeViewModel,
) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") {
            HomeScreen(navController = navController, homeViewModel)
        }

        composable("detailScreen/{movie}", arguments = listOf(
            navArgument("movie") { type = NavType.StringType }
        )) {
            val json = it.arguments?.getString("movie")
            val movie = Gson().fromJson(json, Movies::class.java)
            DetailScreen(movie)
        }
    }
}
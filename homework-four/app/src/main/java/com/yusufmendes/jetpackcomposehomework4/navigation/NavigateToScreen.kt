package com.yusufmendes.jetpackcomposehomework4.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.yusufmendes.jetpackcomposehomework4.presentation.favorites.FavoritesScreen
import com.yusufmendes.jetpackcomposehomework4.presentation.home.HomeScreen
import com.yusufmendes.jetpackcomposehomework4.presentation.profile.ProfileScreen
import com.yusufmendes.jetpackcomposehomework4.presentation.search.SearchScreen

@Composable
fun NavigateToScreen(selectScreen: String) {

    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = selectScreen) {
        composable("homeScreen") {
            HomeScreen(navController = navController)
        }
        composable("searchScreen") {
            SearchScreen(navController = navController)
        }
        composable("favoritesScreen") {
            FavoritesScreen(navController = navController)
        }
        composable("profileScreen") {
            ProfileScreen(navController = navController)
        }
    }
}
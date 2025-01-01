package com.yusufmendes.jetpackcomposeproject2.ui.navigate

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.google.gson.Gson
import com.yusufmendes.jetpackcomposeproject2.data.model.Products
import com.yusufmendes.jetpackcomposeproject2.ui.presentation.DetailScreen
import com.yusufmendes.jetpackcomposeproject2.ui.presentation.HomeScreen

@Composable
fun NavigateToScreen() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = "homeScreen") {
        composable("homeScreen") {
            HomeScreen(navController = navController)
        }

        composable(
            route = "detailScreen/{name}/{age}/{height}/{isMarried}/{product}",
            arguments = listOf(
                navArgument("name") { type = NavType.StringType },
                navArgument("age") { type = NavType.IntType },
                navArgument("height") { type = NavType.FloatType },
                navArgument("isMarried") { type = NavType.BoolType },
                navArgument("product") { type = NavType.StringType },
            )
        ) {
            val name = it.arguments?.getString("name")!!
            val age = it.arguments?.getInt("age")!!
            val height = it.arguments?.getFloat("height")!!
            val isMarried = it.arguments?.getBoolean("isMarried")!!

            //string to json
            val jsonProduct = it.arguments?.getString("product")!!
            val product = Gson().fromJson(jsonProduct, Products::class.java)

            DetailScreen(navController = navController, name, age, height, isMarried, product)
        }
    }
}
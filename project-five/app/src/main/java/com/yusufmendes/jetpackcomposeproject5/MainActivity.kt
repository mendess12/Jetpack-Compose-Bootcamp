package com.yusufmendes.jetpackcomposeproject5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.yusufmendes.jetpackcomposeproject5.presentation.add.AddUserViewModel
import com.yusufmendes.jetpackcomposeproject5.presentation.detail.DetailViewModel
import com.yusufmendes.jetpackcomposeproject5.presentation.home.HomeViewModel
import com.yusufmendes.jetpackcomposeproject5.presentation.navigation.NavigateToScreen
import com.yusufmendes.jetpackcomposeproject5.ui.theme.JetpackComposeProject5Theme
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val homeViewModel: HomeViewModel by viewModels()
    private val addUserViewModel: AddUserViewModel by viewModels()
    private val detailViewModel: DetailViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject5Theme {
                NavigateToScreen(homeViewModel, detailViewModel, addUserViewModel)
            }
        }
    }
}
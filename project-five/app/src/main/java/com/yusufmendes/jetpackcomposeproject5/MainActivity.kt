package com.yusufmendes.jetpackcomposeproject5

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposeproject5.presentation.add.AddUserScreen
import com.yusufmendes.jetpackcomposeproject5.presentation.navigation.NavigateToScreen
import com.yusufmendes.jetpackcomposeproject5.ui.theme.JetpackComposeProject5Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject5Theme {
                NavigateToScreen()
            }
        }
    }
}
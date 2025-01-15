package com.yusufmendes.jetpackcomposeproject4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposeproject4.ui.presentation.HomeScreen
import com.yusufmendes.jetpackcomposeproject4.ui.theme.JetpackComposeProject4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject4Theme {
                HomeScreen()
            }
        }
    }
}

package com.yusufmendes.jetpackcomposeproject8

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposeproject8.presentation.HomeScreen
import com.yusufmendes.jetpackcomposeproject8.ui.theme.JetpackComposeProject8Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject8Theme {
                HomeScreen()
            }
        }
    }
}

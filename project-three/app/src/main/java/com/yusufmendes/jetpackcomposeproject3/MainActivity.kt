package com.yusufmendes.jetpackcomposeproject3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposeproject3.ui.presentation.HomeScreen
import com.yusufmendes.jetpackcomposeproject3.ui.theme.JetpackComposeProject3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject3Theme {
                HomeScreen()
            }
        }
    }
}

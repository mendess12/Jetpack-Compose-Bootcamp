package com.yusufmendes.jetpackcomposeproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposeproject2.ui.navigate.NavigateToScreen
import com.yusufmendes.jetpackcomposeproject2.ui.theme.JetpackComposeProject2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject2Theme {
                NavigateToScreen()
            }
        }
    }
}
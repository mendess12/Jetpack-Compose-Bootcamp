package com.yusufmendes.jetpackcomposehomework2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposehomework2.ui.navigate.NavigateToScreen
import com.yusufmendes.jetpackcomposehomework2.ui.theme.JetpackComposeHomework2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeHomework2Theme {
                NavigateToScreen()
            }
        }
    }
}

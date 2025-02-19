package com.yusufmendes.jetpackcomposehomework4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposehomework4.presentation.bottombar.BottomBarScreen
import com.yusufmendes.jetpackcomposehomework4.ui.theme.JetpackComposeHomework4Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeHomework4Theme {
                BottomBarScreen()
            }
        }
    }
}

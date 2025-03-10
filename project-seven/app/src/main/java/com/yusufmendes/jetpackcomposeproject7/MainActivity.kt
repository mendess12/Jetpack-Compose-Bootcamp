package com.yusufmendes.jetpackcomposeproject7

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposeproject7.presentation.HomeScreen
import com.yusufmendes.jetpackcomposeproject7.ui.theme.JetpackComposeProject7Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject7Theme {
                HomeScreen()
            }
        }
    }
}

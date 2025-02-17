package com.yusufmendes.jetpackcomposehomework4

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.yusufmendes.jetpackcomposehomework4.navigation.NavigateToScreen
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

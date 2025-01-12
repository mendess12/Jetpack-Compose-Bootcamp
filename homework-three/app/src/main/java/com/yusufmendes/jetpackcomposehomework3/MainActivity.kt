package com.yusufmendes.jetpackcomposehomework3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.yusufmendes.jetpackcomposehomework3.ui.presentation.CalculatorApp
import com.yusufmendes.jetpackcomposehomework3.ui.theme.JetpackComposeHomework3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeHomework3Theme {
                CalculatorApp()
            }
        }
    }
}

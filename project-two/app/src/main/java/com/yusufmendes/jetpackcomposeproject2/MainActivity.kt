package com.yusufmendes.jetpackcomposeproject2

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.yusufmendes.jetpackcomposeproject2.ui.presentation.HomeScreen
import com.yusufmendes.jetpackcomposeproject2.ui.theme.JetpackComposeProject2Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject2Theme {
                HomeScreen()
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeProject2Theme {
        HomeScreen()
    }
}
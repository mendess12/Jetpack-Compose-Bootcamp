package com.yusufmendes.jetpackcomposeproject1.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable

@Composable
fun Chip(text: String,darkTheme: Boolean = isSystemInDarkTheme()) {
    Button(
        onClick = {},
        colors = ButtonDefaults.buttonColors(
            contentColor = textColor,
            containerColor = if (darkTheme) mainColorDark else mainColor,
        )
    ) {
        Text(text)
    }
}
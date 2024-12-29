package com.yusufmendes.jetpackcomposehomework1.ui.widgets

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColorDarkMode

@Composable
fun EditAndMessageButton(text: String, color: Color, darkTheme: Boolean = isSystemInDarkTheme()) {
    Button(
        onClick = {}, colors = ButtonDefaults.buttonColors(
            contentColor = if (darkTheme) textColorDarkMode else textColor,
            containerColor = color
        )
    ) {
        Text(
            text,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )
    }
}
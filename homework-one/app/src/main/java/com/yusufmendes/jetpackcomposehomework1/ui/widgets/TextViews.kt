package com.yusufmendes.jetpackcomposehomework1.ui.widgets

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColorDarkMode

@Composable
fun PersonalInformationText(
    title: String,
    style: TextStyle,
    darkTheme: Boolean = isSystemInDarkTheme()
) {
    Text(
        title,
        style = style,
        color = if (darkTheme) textColorDarkMode else textColor
    )
}
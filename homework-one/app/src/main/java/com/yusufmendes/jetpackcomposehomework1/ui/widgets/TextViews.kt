package com.yusufmendes.jetpackcomposehomework1.ui.widgets

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.TextStyle
import com.yusufmendes.jetpackcomposehomework1.ui.theme.titleColor

@Composable
fun PersonalInformationText(title: String, style: TextStyle){
    Text(
        title,
        style = style,
        color = titleColor
    )
}
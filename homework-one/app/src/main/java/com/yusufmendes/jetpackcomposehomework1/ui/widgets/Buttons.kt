package com.yusufmendes.jetpackcomposehomework1.ui.widgets

import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposehomework1.ui.theme.subTitleColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColor

@Composable
fun EditAndMessageButton(text: String) {
    Button(
        onClick = {}, colors = ButtonDefaults.buttonColors(
            contentColor = textColor,
            containerColor = subTitleColor
        )
    ) {
        Text(
            text,
            fontSize = 20.sp,
            fontFamily = FontFamily.Serif
        )
    }
}
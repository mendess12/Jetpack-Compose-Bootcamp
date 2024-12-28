package com.yusufmendes.jetpackcomposehomework1.ui.widgets

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import com.yusufmendes.jetpackcomposehomework1.ui.theme.titleColor

@Composable
fun ImageIcon(id: Int, size: Dp) {
    Image(
        painter = painterResource(id = id),
        contentDescription = "",
        modifier = Modifier
            .size(size)
            .clip(CircleShape)
            .border(
                3.dp, Color.White,
                CircleShape
            )
            .background(titleColor)
    )
}
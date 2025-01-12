package com.yusufmendes.jetpackcomposehomework3.ui.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposehomework3.ui.theme.MathOperatorButtonColor
import com.yusufmendes.jetpackcomposehomework3.ui.theme.NumberButtonColor
import com.yusufmendes.jetpackcomposehomework3.ui.theme.ScreenBackgroundColor
import com.yusufmendes.jetpackcomposehomework3.ui.theme.TextColor

@Composable
fun CalculatorApp() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(ScreenBackgroundColor),
        verticalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = "Calculator app",
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f)
                .padding(top = 64.dp, end = 40.dp),
            textAlign = TextAlign.End,
            fontStyle = FontStyle.Italic,
            color = TextColor,
            fontSize = 24.sp
        )

        Column(modifier = Modifier.fillMaxWidth()) {
            val buttons = listOf(
                listOf("7", "8", "9", "/"),
                listOf("4", "5", "6", "x"),
                listOf("1", "2", "3", "-"),
                listOf("C", "0", "=", "+")
            )

            buttons.forEach { row ->
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    row.forEach { label ->
                        Button(
                            shape = CircleShape,
                            colors = if (label in listOf("/", "x", "-", "+", "=")) {
                                ButtonDefaults.buttonColors(
                                    containerColor = MathOperatorButtonColor,
                                    contentColor = TextColor
                                )
                            } else {
                                ButtonDefaults.buttonColors(
                                    containerColor = NumberButtonColor,
                                    contentColor = TextColor
                                )
                            },
                            onClick = {},
                            modifier = Modifier
                                .weight(1f)
                                .aspectRatio(1f)
                                .padding(4.dp)
                        ) {
                            Text(
                                text = label,
                                color = TextColor,
                                fontSize = 20.sp,
                                fontStyle = FontStyle.Italic,
                                fontFamily = FontFamily.SansSerif
                            )
                        }
                    }
                }
            }
        }
    }
}

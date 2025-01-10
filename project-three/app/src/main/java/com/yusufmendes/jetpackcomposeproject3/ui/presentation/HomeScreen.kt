package com.yusufmendes.jetpackcomposeproject3.ui.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Switch
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposeproject3.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen() {

    val enteredValue = remember { mutableStateOf("") }
    val receivedValue = remember { mutableStateOf("") }
    val switchState = remember { mutableStateOf(false) }
    val checkBoxState = remember { mutableStateOf(false) }
    val radioButtonValue = remember { mutableStateOf(0) }
    val progressState = remember { mutableStateOf(false) }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.Magenta,
                titleContentColor = Color.Black
            ),
            title = {
                Text(
                    text = "Home",
                    textAlign = TextAlign.Center,
                    fontSize = 30.sp,
                    fontStyle = FontStyle.Italic,
                    modifier = Modifier.fillMaxWidth()
                )
            })
    }) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            //text
            Text(
                text = receivedValue.value,
                color = Color.Black,
                fontSize = 24.sp,
                fontFamily = FontFamily.SansSerif
            )

            //textField
            TextField(
                value = enteredValue.value,
                onValueChange = { enteredValue.value = it },
                label = {
                    Text(
                        text = "Enter data",
                        fontSize = 18.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.Magenta
                    )
                },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
                visualTransformation = PasswordVisualTransformation()
            )

            //Button
            Button(colors = ButtonDefaults.buttonColors(
                contentColor = Color.Black,
                containerColor = Color.Magenta
            ), onClick = {
                receivedValue.value = enteredValue.value
            }) {
                Text("Read data", fontSize = 24.sp, fontStyle = FontStyle.Italic)
            }

            //Image
            Image(painter = painterResource(R.drawable.mood_icon), contentDescription = "")

            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                //Switch
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Switch(
                        checked = switchState.value,
                        onCheckedChange = { switchState.value = it })
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Android Kotlin",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }

                Row(verticalAlignment = Alignment.CenterVertically) {
                    //CheckBox
                    Checkbox(
                        checked = checkBoxState.value,
                        onCheckedChange = { checkBoxState.value = it })
                    Text(
                        modifier = Modifier.padding(10.dp),
                        text = "Jetpack Compose",
                        fontFamily = FontFamily.SansSerif,
                        fontSize = 16.sp,
                        color = Color.Black
                    )
                }
            }

        }
    }
}
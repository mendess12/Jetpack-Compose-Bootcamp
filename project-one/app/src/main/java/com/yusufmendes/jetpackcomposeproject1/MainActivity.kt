package com.yusufmendes.jetpackcomposeproject1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposeproject1.ui.theme.Chip
import com.yusufmendes.jetpackcomposeproject1.ui.theme.JetpackComposeProject1Theme
import com.yusufmendes.jetpackcomposeproject1.ui.theme.mainColor
import com.yusufmendes.jetpackcomposeproject1.ui.theme.mainColorDark
import com.yusufmendes.jetpackcomposeproject1.ui.theme.pacifico
import com.yusufmendes.jetpackcomposeproject1.ui.theme.textColor
import com.yusufmendes.jetpackcomposeproject1.ui.theme.textColor2
import com.yusufmendes.jetpackcomposeproject1.ui.theme.textColor2Dark

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeProject1Theme {
                MainScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen(darkTheme: Boolean = isSystemInDarkTheme()) {

    val configuration = LocalConfiguration.current
    //val screenHeight = configuration.screenHeightDp
    val screenWidth = configuration.screenWidthDp

    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = { Text(stringResource(id = R.string.app_name), fontFamily = pacifico) },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor =  if (darkTheme) mainColorDark else mainColor,
                    titleContentColor = textColor
                )

            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(id = R.string.title),
                color = if (darkTheme) mainColorDark else mainColor,
                fontWeight = FontWeight.Bold,
                fontSize = (screenWidth / 10).sp
            )
            Image(
                painter = painterResource(id = R.drawable.pizza_image),
                contentDescription = ""
            )
            Row(
                modifier = Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Chip(stringResource(id = R.string.cheese_text), darkTheme)
                Chip(stringResource(id = R.string.sausage_text), darkTheme)
                Chip(stringResource(id = R.string.olive_text), darkTheme)
                Chip(stringResource(id = R.string.pepper_text), darkTheme)
            }
            Text(
                text = stringResource(id = R.string.time),
                color = if (darkTheme) textColor2Dark else textColor2,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(id = R.string.title2),
                color = if (darkTheme) mainColorDark else mainColor,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp
            )
            Text(
                text = stringResource(id = R.string.description),
                color = if (darkTheme) textColor2Dark else textColor2,
                fontWeight = FontWeight.Bold,
                fontSize = 22.sp,
                textAlign = TextAlign.Center
            )
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = (screenWidth / 20).dp, end = (screenWidth / 20).dp),
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Text(
                    text = stringResource(id = R.string.price),
                    color = if (darkTheme) mainColorDark else mainColor,
                    fontWeight = FontWeight.Bold,
                    fontSize = 44.sp
                )
                Button(
                    onClick = {},
                    colors = ButtonDefaults.buttonColors(
                        containerColor = if (darkTheme) mainColorDark else mainColor,
                        contentColor = textColor
                    )
                ) {
                    Text(
                        text = stringResource(id = R.string.button_text),
                        color = textColor,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeProject1Theme {
        MainScreen()
    }
}
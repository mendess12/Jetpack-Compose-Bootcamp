package com.yusufmendes.jetpackcomposehomework1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.CenterAlignedTopAppBar
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.yusufmendes.jetpackcomposehomework1.ui.theme.JetpackComposeHomework1Theme
import com.yusufmendes.jetpackcomposehomework1.ui.theme.editButtonColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.messageButtonColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.screenBackground
import com.yusufmendes.jetpackcomposehomework1.ui.theme.screenBackgroundDarkMode
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.textColorDarkMode
import com.yusufmendes.jetpackcomposehomework1.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework1.ui.theme.topBarColorDarkMode
import com.yusufmendes.jetpackcomposehomework1.ui.widgets.EditAndMessageButton
import com.yusufmendes.jetpackcomposehomework1.ui.widgets.ImageIcon
import com.yusufmendes.jetpackcomposehomework1.ui.widgets.PersonalInformationText

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JetpackComposeHomework1Theme {
                ProfileScreen()
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(darkTheme: Boolean = isSystemInDarkTheme()) {
    Scaffold(
        topBar = {
            CenterAlignedTopAppBar(
                title = {
                    Text(
                        text = stringResource(id = R.string.app_name),
                        fontFamily = FontFamily.SansSerif
                    )
                },
                colors = TopAppBarDefaults.topAppBarColors(
                    containerColor = if (darkTheme) topBarColorDarkMode else topBarColor,
                    titleContentColor = if (darkTheme) textColorDarkMode else textColor
                )
            )
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(
                    if (darkTheme) Color(screenBackgroundDarkMode.toArgb()) else Color(
                        screenBackground.toArgb()
                    )
                ),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                //profile image
                ImageIcon(R.drawable.baseline_android_24, 60.dp, darkTheme)
                ImageIcon(R.drawable.profile_image, 150.dp, darkTheme)
                ImageIcon(R.drawable.baseline_message_24, 60.dp, darkTheme)
            }


            //name-surname
            PersonalInformationText(
                stringResource(R.string.name),
                MaterialTheme.typography.headlineMedium,
                darkTheme
            )
            PersonalInformationText(
                stringResource(R.string.title),
                MaterialTheme.typography.bodyLarge,
                darkTheme
            )

            //edit-send message button
            Row(
                horizontalArrangement = Arrangement.SpaceEvenly,
                modifier = Modifier.fillMaxWidth()
            ) {
                EditAndMessageButton(stringResource(id = R.string.edit), editButtonColor, darkTheme)
                EditAndMessageButton(
                    stringResource(id = R.string.message),
                    messageButtonColor,
                    darkTheme
                )
            }

            //about
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(
                        if (darkTheme) Color(screenBackgroundDarkMode.toArgb()) else Color(
                            screenBackground.toArgb()
                        )
                    )
                    .padding(16.dp)
            ) {
                Text(
                    stringResource(id = R.string.about),
                    style = MaterialTheme.typography.bodyMedium,
                    color = if (darkTheme) textColorDarkMode else textColor
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    JetpackComposeHomework1Theme {
        ProfileScreen()
    }
}
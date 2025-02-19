package com.yusufmendes.jetpackcomposehomework4.presentation.favorites

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yusufmendes.jetpackcomposehomework4.R
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarTextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampaignScreen(navController: NavController) {

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = topBarColor,
                titleContentColor = topBarTextColor
            ),
            title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.home),
                    fontSize = 28.sp,
                    fontStyle = FontStyle.Italic,
                    fontFamily = FontFamily.SansSerif,
                    textAlign = TextAlign.Center
                )
            })
    }) { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(80.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {

                Box(
                    modifier = Modifier
                        .padding(8.dp)
                        .clip(shape = RoundedCornerShape(10.dp))
                        .background(Color.LightGray)
                        .weight(1f)
                ) {
                    Text(
                        modifier = Modifier
                            .padding(8.dp)
                            .fillMaxWidth(),
                        text = stringResource(R.string.campaign),
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Normal,
                        textAlign = TextAlign.Center,
                        color = topBarColor
                    )
                }

                Box(modifier = Modifier.weight(1f)) {
                    Text(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(8.dp),
                        text = stringResource(R.string.announcements),
                        fontSize = 14.sp,
                        fontFamily = FontFamily.SansSerif,
                        fontStyle = FontStyle.Normal,
                        textAlign = TextAlign.Center
                    )
                }
            }

            Text(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 12.dp, 8.dp),
                text = stringResource(R.string.info),
                fontSize = 12.sp,
                fontStyle = FontStyle.Normal,
                fontFamily = FontFamily.SansSerif,
                color = topBarColor
            )


            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {

                Box(
                    modifier = Modifier
                        .padding(start = 12.dp, 8.dp)
                        .shadow(2.dp)
                        .background(color = Color.White)
                        .size(30.dp)
                ) {
                    Image(
                        modifier = Modifier
                            .size(24.dp)
                            .align(Alignment.Center),
                        painter = painterResource(R.drawable.add_icon),
                        contentDescription = "",
                    )
                }

                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp),
                    text = stringResource(R.string.add_campaign_code),
                    textAlign = TextAlign.Start,
                    fontSize = 12.sp,
                    color = topBarColor,
                )
            }
        }
    }
}
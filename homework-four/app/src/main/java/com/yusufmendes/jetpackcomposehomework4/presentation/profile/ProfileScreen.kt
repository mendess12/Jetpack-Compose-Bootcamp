package com.yusufmendes.jetpackcomposehomework4.presentation.profile

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
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
import com.yusufmendes.jetpackcomposehomework4.ui.theme.screenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarTextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ProfileScreen(navController: NavController) {

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = topBarColor,
                titleContentColor = topBarTextColor
            ),
            title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.profile),
                    fontSize = 20.sp,
                    fontStyle = FontStyle.Normal,
                    fontFamily = FontFamily.Serif,
                    textAlign = TextAlign.Center
                )
            })
    }) { paddingValues ->

        Column(
            modifier = Modifier
                .padding(paddingValues)
                .background(screenBackgroundColor),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.profile_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
                Text(
                    modifier = Modifier.weight(4f),
                    text = stringResource(R.string.login),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )
                Image(
                    painter = painterResource(R.drawable.next_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp)
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.location_image),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
                Text(
                    modifier = Modifier.weight(4f),
                    text = stringResource(R.string.my_address),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )
                Image(
                    painter = painterResource(R.drawable.next_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.favorite_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
                Text(
                    modifier = Modifier.weight(4f),
                    text = stringResource(R.string.favorite_product),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )
                Image(
                    painter = painterResource(R.drawable.next_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.live_support_image),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
                Text(
                    modifier = Modifier.weight(4f),
                    text = stringResource(R.string.live_support),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )
                Image(
                    painter = painterResource(R.drawable.next_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
            }

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Image(
                    painter = painterResource(R.drawable.help_image),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
                Text(
                    modifier = Modifier.weight(4f),
                    text = stringResource(R.string.help),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )
                Image(
                    painter = painterResource(R.drawable.next_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
            }

            Text(
                text = stringResource(R.string.language),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 16.dp, bottom = 8.dp),
                textAlign = TextAlign.Start,
                color = textColor,
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = Modifier
                        .weight(4f)
                        .padding(start = 16.dp,8.dp),
                    text = stringResource(R.string.turkish),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )
                Image(
                    painter = painterResource(R.drawable.next_icon),
                    contentDescription = "",
                    modifier = Modifier
                        .padding(8.dp)
                        .weight(1f)
                )
            }

            Spacer(
                modifier = Modifier
                    .size(40.dp)
            )

            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .size(50.dp)
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
            ) {
                Text(
                    modifier = Modifier
                        .weight(4f)
                        .padding(start = 16.dp,8.dp),
                    text = stringResource(R.string.version),
                    textAlign = TextAlign.Start,
                    fontSize = 14.sp
                )

                Text(
                    modifier = Modifier
                        .weight(1f)
                        .padding(8.dp),
                    text = stringResource(R.string.version_size),
                    textAlign = TextAlign.Start,
                    fontSize = 12.sp,
                    color = Color.LightGray
                )

            }
        }

    }

}
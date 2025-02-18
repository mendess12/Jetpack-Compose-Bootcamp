package com.yusufmendes.jetpackcomposehomework4.presentation.search

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyHorizontalGrid
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yusufmendes.jetpackcomposehomework4.R
import com.yusufmendes.jetpackcomposehomework4.ui.theme.itemScreenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.screenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarTextColor

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchScreen(navController: NavController) {

    val search = remember { mutableStateOf("") }
    val categoryList = remember {
        mutableStateListOf(
            "su",
            "yoğurt",
            "çikolata",
            "ekmek",
            "süt",
            "cips",
            "kola",
            "yumurta",
            "makarna"
        )
    }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = topBarColor,
                titleContentColor = topBarTextColor
            ), title = {
                Text(
                    modifier = Modifier.fillMaxWidth(),
                    text = stringResource(R.string.search_screen),
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
                    .background(Color.White),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceEvenly
            ) {
                Image(
                    painter = painterResource(R.drawable.search_icon),
                    contentDescription = "",
                    modifier = Modifier.weight(1f)
                )
                TextField(
                    value = search.value,
                    onValueChange = { search.value = it },
                    modifier = Modifier
                        .weight(8f)
                        .border(BorderStroke(1.dp, Color.White)),
                    label = {
                        Text(
                            text = stringResource(R.string.search),
                            fontSize = 16.sp,
                            fontStyle = FontStyle.Normal
                        )
                    },
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.White,
                        focusedContainerColor = Color.White,
                        focusedIndicatorColor = Color.Transparent,
                        unfocusedIndicatorColor = Color.Transparent,
                        disabledIndicatorColor = Color.Transparent
                    )
                )
                Image(
                    painter = painterResource(R.drawable.microphone_icon),
                    contentDescription = "",
                    modifier = Modifier.weight(1f)
                )
            }

            Text(
                text = stringResource(R.string.popular_search),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 8.dp, bottom = 8.dp),
                textAlign = TextAlign.Start,
                color = textColor,
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal
            )

            LazyHorizontalGrid(
                modifier = Modifier
                    .fillMaxWidth()
                    .background(Color.White)
                    .height(40.dp),
                rows = GridCells.Fixed(1)
            ) {
                items(
                    count = categoryList.count(),
                    itemContent = {
                        val category = categoryList[it]
                        Card(
                            modifier = Modifier
                                .padding(5.dp)
                                .background(itemScreenBackgroundColor)
                                .border(BorderStroke(0.7f.dp, color = Color.LightGray))
                                .size(75.dp),
                        ) {
                            Box(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .align(alignment = Alignment.CenterHorizontally)
                                    .background(itemScreenBackgroundColor)
                            ) {
                                Text(
                                    modifier = Modifier
                                        .padding(2.dp)
                                        .fillMaxSize(),
                                    text = category,
                                    color = textColor,
                                    fontSize = 12.sp,
                                    fontFamily = FontFamily.Serif,
                                    textAlign = TextAlign.Center,
                                    fontStyle = FontStyle.Normal,
                                )
                            }
                        }
                    }
                )
            }
        }
    }
}
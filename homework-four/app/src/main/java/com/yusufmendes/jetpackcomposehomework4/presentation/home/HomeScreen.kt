package com.yusufmendes.jetpackcomposehomework4.presentation.home

import android.annotation.SuppressLint
import android.app.Activity
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.imageResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.yusufmendes.jetpackcomposehomework4.R
import com.yusufmendes.jetpackcomposehomework4.data.model.Foods
import com.yusufmendes.jetpackcomposehomework4.ui.theme.itemScreenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.screenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarTextColor

@SuppressLint("ContextCastToActivity")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    val foodList = remember { mutableStateListOf<Foods>() }

    LaunchedEffect(key1 = true) {
        val food1 = Foods(1, "Su & İçecek", "water")
        val food2 = Foods(2, "Atıştırmalık", "atistirmalik")
        val food3 = Foods(3, "Meyve & Sebze", "fruit")
        val food4 = Foods(4, "Süt Ürünleri", "sut_urunleri")
        val food5 = Foods(5, "Fırından", "simit")
        val food6 = Foods(6, "Dondurma", "dondurma")
        val food7 = Foods(7, "Temel Gıda", "temel_gida")
        val food8 = Foods(8, "Kahvaltılık", "kahvaltilik")
        val food9 = Foods(9, "Yiyecek", "yiyecek")
        val food10 = Foods(10, "Et, Tavuk & Balık", "et")
        val food11 = Foods(11, "Fit & Form", "fit_form")
        val food12 = Foods(12, "Kişisel Bakım", "kisisel_bakim")
        val food13 = Foods(13, "Ev Bakım", "ev_bakim")
        val food14 = Foods(14, "Ev & Yaşam", "ev_yasam")
        val food15 = Foods(15, "Evcil Hayvan", "evcil_hayvan")
        val food16 = Foods(16, "Bebek", "bebek")
        val food17 = Foods(16, "Cinsel Sağlık", "cinsel_saglik")

        foodList.add(food1)
        foodList.add(food2)
        foodList.add(food3)
        foodList.add(food4)
        foodList.add(food5)
        foodList.add(food6)
        foodList.add(food7)
        foodList.add(food8)
        foodList.add(food9)
        foodList.add(food10)
        foodList.add(food11)
        foodList.add(food12)
        foodList.add(food13)
        foodList.add(food14)
        foodList.add(food15)
        foodList.add(food16)
        foodList.add(food17)

    }

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
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
                .background(screenBackgroundColor),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(16.dp),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Image(painter = painterResource(R.drawable.home_icon), contentDescription = "")
                Text(text = stringResource(R.string.address))
                Image(painter = painterResource(R.drawable.next_icon), contentDescription = "")
            }

            Column(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalArrangement = Arrangement.Top,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxWidth()
                        .height(200.dp),
                    painter = painterResource(R.drawable.getir_photo),
                    contentDescription = "",
                )
            }

            LazyVerticalGrid(
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxSize(),
                columns = GridCells.Fixed(count = 4)
            ) {
                items(
                    count = foodList.count(),
                    itemContent = {
                        val food = foodList[it]
                        Card(
                            modifier = Modifier
                                .padding(5.dp)
                                .size(100.dp)
                                .background(itemScreenBackgroundColor)
                        ) {
                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .align(alignment = Alignment.CenterHorizontally)
                                    .background(itemScreenBackgroundColor)
                            ) {
                                val activity = (LocalContext.current as Activity)
                                Image(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .weight(1f)
                                        .size(100.dp, 75.dp),
                                    bitmap = ImageBitmap.imageResource(
                                        id = activity.resources.getIdentifier(
                                            food.image,
                                            "drawable",
                                            activity.packageName
                                        )
                                    ),
                                    contentDescription = "",
                                )
                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = food.name,
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
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
import com.yusufmendes.jetpackcomposehomework4.data.model.Categories
import com.yusufmendes.jetpackcomposehomework4.ui.theme.itemScreenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.screenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarTextColor

@SuppressLint("ContextCastToActivity")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(navController: NavController) {

    val categoryList = remember { mutableStateListOf<Categories>() }

    LaunchedEffect(key1 = true) {
        val category1 = Categories(1, "Su & İçecek", "water")
        val category2 = Categories(2, "Atıştırmalık", "atistirmalik")
        val category3 = Categories(3, "Meyve & Sebze", "fruit")
        val category4 = Categories(4, "Süt Ürünleri", "sut_urunleri")
        val category5 = Categories(5, "Fırından", "simit")
        val category6 = Categories(6, "Dondurma", "dondurma")
        val category7 = Categories(7, "Temel Gıda", "temel_gida")
        val category8 = Categories(8, "Kahvaltılık", "kahvaltilik")
        val category9 = Categories(9, "Yiyecek", "yiyecek")
        val category10 = Categories(10, "Et, Tavuk & Balık", "et")
        val category11 = Categories(11, "Fit & Form", "fit_form")
        val category12 = Categories(12, "Kişisel Bakım", "kisisel_bakim")
        val category13 = Categories(13, "Ev Bakım", "ev_bakim")
        val category14 = Categories(14, "Ev & Yaşam", "ev_yasam")
        val category15 = Categories(15, "Evcil Hayvan", "evcil_hayvan")
        val category16 = Categories(16, "Bebek", "bebek")
        val category17 = Categories(16, "Cinsel Sağlık", "cinsel_saglik")

        categoryList.add(category1)
        categoryList.add(category2)
        categoryList.add(category3)
        categoryList.add(category4)
        categoryList.add(category5)
        categoryList.add(category6)
        categoryList.add(category7)
        categoryList.add(category8)
        categoryList.add(category9)
        categoryList.add(category10)
        categoryList.add(category11)
        categoryList.add(category12)
        categoryList.add(category13)
        categoryList.add(category14)
        categoryList.add(category15)
        categoryList.add(category16)
        categoryList.add(category17)

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
                    count = categoryList.count(),
                    itemContent = {
                        val food = categoryList[it]
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
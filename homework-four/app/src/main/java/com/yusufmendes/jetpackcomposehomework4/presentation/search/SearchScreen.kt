package com.yusufmendes.jetpackcomposehomework4.presentation.search

import android.annotation.SuppressLint
import android.app.Activity
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
import androidx.compose.material3.Card
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
import androidx.compose.ui.graphics.Color
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
import com.yusufmendes.jetpackcomposehomework4.ui.theme.foodTextColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.itemScreenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.screenBackgroundColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.textColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarColor
import com.yusufmendes.jetpackcomposehomework4.ui.theme.topBarTextColor

@SuppressLint("ContextCastToActivity")
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

    val foodList = remember { mutableStateListOf<Foods>() }
    val food1 = Foods(1, "Ekmek", "ekmek_urun", 15.00, "250 g")
    val food2 = Foods(2, "Beypazarı Maden Suyu", "soda_urun", 42.50, "6 x 200 ml")
    val food3 = Foods(3, "İthal Muz", "muz_urun", 74.99, "650 g")
    val food4 = Foods(4, "Aslı Simit", "simit_urun", 29.50, "2 x 100 ml")
    val food5 = Foods(5, "Kızartmalık Patates", "patates_urun", 54.99, "2 kg")
    val food6 = Foods(6, "Çengelköy Salatalık", "salatalik_urun", 56.99, "500 g")
    val food7 = Foods(7, "CP Büyük Boy", "yumurta_urun", 99.50, "15'li")
    val food8 = Foods(8, "Limon", "limon_urun", 32.99, "1 kg")
    val food9 = Foods(9, "Kuzeyden", "su_urun", 82.99, "2 x 5 L")
    val food10 = Foods(10, "Yemeye Hazır Avakado", "avakado_urun", 46.99, "1 Adet")
    val food11 = Foods(11, "Sütaş Kaymaksız Yağurt", "yogurt_urun", 63.99, "1 kg")
    val food12 = Foods(12, "Havuç", "havuc_urun", 26.99, "500 g")

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

            Text(
                text = stringResource(R.string.best_sellers),
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(top = 12.dp, start = 8.dp, bottom = 8.dp),
                textAlign = TextAlign.Start,
                color = textColor,
                fontSize = 14.sp,
                fontStyle = FontStyle.Normal
            )

            LazyVerticalGrid(
                modifier = Modifier
                    .fillMaxSize(),
                columns = GridCells.Fixed(count = 3)
            ) {
                items(
                    count = foodList.count(),
                    itemContent = {
                        val food = foodList[it]
                        Card(
                            modifier = Modifier
                                .size(150.dp)
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
                                        .size(100.dp, 75.dp)
                                        .border(1.dp, color = Color.White),
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
                                    text = "₺ ${food.price}",
                                    color = foodTextColor,
                                    fontSize = 13.sp,
                                    textAlign = TextAlign.Center,
                                    fontStyle = FontStyle.Normal
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

                                Text(
                                    modifier = Modifier.fillMaxWidth(),
                                    text = food.size,
                                    color = Color.LightGray,
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
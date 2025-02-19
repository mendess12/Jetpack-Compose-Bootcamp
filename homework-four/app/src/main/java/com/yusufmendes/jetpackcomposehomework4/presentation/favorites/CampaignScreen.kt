package com.yusufmendes.jetpackcomposehomework4.presentation.favorites

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavController
import com.yusufmendes.jetpackcomposehomework4.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun CampaignScreen(navController: NavController) {

    Scaffold(topBar = {
        TopAppBar(title = {
            Text(text = stringResource(R.string.favorites))
        })
    }) { paddingValues ->

        Column(
            modifier = Modifier.padding(paddingValues),
            verticalArrangement = Arrangement.SpaceEvenly,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

        }

    }
}
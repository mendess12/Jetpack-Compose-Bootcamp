package com.yusufmendes.jetpackcomposeproject5.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.SnackbarHost
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.livedata.observeAsState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.google.gson.Gson
import com.yusufmendes.jetpackcomposeproject5.R
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(
    navController: NavController,
    homeViewModel: HomeViewModel
) {

    val isSearching = remember { mutableStateOf(false) }
    val word = remember { mutableStateOf("") }
    val userList = homeViewModel.userList.observeAsState(listOf())
    val scope = rememberCoroutineScope()
    val snackbarHostState = remember { SnackbarHostState() }

    LaunchedEffect(true) {
        homeViewModel.getUserList()
    }

    Scaffold(topBar = {
        TopAppBar(
            colors = TopAppBarDefaults.topAppBarColors(
                containerColor = Color.LightGray,
                titleContentColor = Color.Black
            ),
            title = {
                if (isSearching.value) {
                    TextField(
                        value = word.value,
                        onValueChange = {
                            word.value = it
                            homeViewModel.searchUser(it)
                        },
                        label = {
                            Text(text = "Searching")
                        }, colors = TextFieldDefaults.textFieldColors(
                            containerColor = Color.Transparent,
                            focusedLabelColor = Color.White,
                            focusedIndicatorColor = Color.White,
                            unfocusedLabelColor = Color.Black,
                            unfocusedIndicatorColor = Color.White
                        )
                    )
                } else {
                    Text(
                        modifier = Modifier.fillMaxWidth(),
                        text = "Users",
                        fontStyle = FontStyle.Italic,
                        fontSize = 24.sp,
                        color = Color.Black
                    )
                }
            },
            actions = {
                if (isSearching.value) {
                    IconButton(
                        onClick = {
                            isSearching.value = false
                            word.value = " "
                        }
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.close_icon),
                            contentDescription = ""
                        )
                    }
                } else {
                    homeViewModel.getUserList()
                    IconButton(
                        onClick = {
                            isSearching.value = true

                        }
                    ) {
                        Icon(
                            painter = painterResource(R.drawable.search_icon),
                            contentDescription = ""
                        )
                    }
                }
            }
        )
    },
        floatingActionButton = {
            FloatingActionButton(
                onClick = {
                    navController.navigate("addUserScreen")
                },
                content = {
                    Image(
                        painter = painterResource(R.drawable.add_icon),
                        contentDescription = ""
                    )
                }
            )
        },
        snackbarHost = {
            SnackbarHost(hostState = snackbarHostState)
        }
    ) { paddingValues ->
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues),
        ) {
            // recyclerview or list
            items(
                count = userList.value.count(),
                itemContent = {
                    val user = userList.value[it]

                    Card(modifier = Modifier.padding(5.dp)) {

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                                .clickable {
                                    val userJson = Gson().toJson(user)
                                    navController.navigate("detailScreen/$userJson")
                                },
                            verticalAlignment = Alignment.CenterVertically,
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Column(modifier = Modifier.padding(10.dp)) {
                                Text(text = user.kisi_ad, fontSize = 20.sp)
                                Spacer(modifier = Modifier.size(10.dp))
                                Text(text = user.kisi_tel, fontSize = 16.sp)
                            }
                            IconButton(
                                onClick = {
                                    scope.launch {
                                        val snackbar =
                                            snackbarHostState.showSnackbar(
                                                "${user.kisi_ad} delete ?",
                                                actionLabel = "YES"
                                            )
                                        if (snackbar == SnackbarResult.ActionPerformed) {
                                            homeViewModel.deleteUser(userId = user.kisi_id)
                                        }
                                    }
                                }
                            ) {
                                Icon(
                                    painter = painterResource(R.drawable.close_icon),
                                    contentDescription = ""
                                )
                            }

                        }
                    }
                }
            )
        }
    }
}
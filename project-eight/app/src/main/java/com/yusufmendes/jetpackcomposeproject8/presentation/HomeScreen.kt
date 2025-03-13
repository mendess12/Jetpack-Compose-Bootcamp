package com.yusufmendes.jetpackcomposeproject8.presentation

import android.util.Log
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp
import com.yusufmendes.jetpackcomposeproject8.util.AppPref
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

@Composable
fun HomeScreen() {

    val context = LocalContext.current
    val appPref = AppPref(context)
    var count = remember { mutableStateOf(0) }

    LaunchedEffect(key1 = true) {

        CoroutineScope(Dispatchers.Main).launch {
            //save
            appPref.saveName("Yusuf")
            appPref.saveAge(24)
            appPref.saveHeight(1.78)
            appPref.saveMarry(false)

            val list = HashSet<String>()
            list.add("Mehmet")
            list.add("Eda")
            appPref.saveList(list)

            //delete
            /* appPref.deleteName()
             appPref.deleteAge()
             appPref.deleteHeight()
             appPref.deleteMarry()
             appPref.deleteList()
             appPref.deleteCount()*/

            //read
            val getName = appPref.readName()
            Log.e("Gelen isim", getName)
            val getAge = appPref.readAge()
            Log.e("Gelen Yaş", getAge.toString())
            val getHeight = appPref.readHeight()
            Log.e("Gelen Boy", getHeight.toString())
            val getMarry = appPref.readMarry()
            Log.e("Gelen Evli mi", getMarry.toString())

            val getList = appPref.readList()
            for (list in getList!!) {
                Log.e("Gelen Liste", list)
            }

            //count app
            var getCount = appPref.readCount()
            count.value = ++getCount
            appPref.saveCount(getCount )
        }
    }

    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Text(text = "Açılış sayısı : ${count.value}", fontSize = 30.sp)
    }
}
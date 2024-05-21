package com.example.storeapp.component

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TopBarEnd(
    Text:@Composable ()->Unit,
    IconView:@Composable ()->Unit,
    IconShow:Boolean,
){
    Box(modifier = Modifier.fillMaxWidth()){
        Row (
            horizontalArrangement = Arrangement.End,
            verticalAlignment = Alignment.CenterVertically, modifier = Modifier
            .fillMaxWidth()){
            Text()
            if(IconShow){
                IconView()
            }
        }
    }
}
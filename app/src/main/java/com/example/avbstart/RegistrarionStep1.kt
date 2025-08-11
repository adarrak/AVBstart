package com.example.avbstart

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.res.painterResource

@Composable
fun ScreenRegistrationStep1() {
DrawLogo()
}

@Composable
fun DrawLogo(){
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 71.dp)
            .size(width = 103.dp, height = 103.dp),
        contentAlignment = Alignment.TopCenter

    ){
        Image(painter = painterResource(id = R.drawable.register_logo_avb),
            contentDescription = "Logo Image")
    }
    Box(
        modifier = Modifier.padding(top = 140.dp)
    ){
        Column (){  }
    }
}


@Composable
@Preview
fun ScreenRegistrationStep1Prev() {
ScreenRegistrationStep1()
}
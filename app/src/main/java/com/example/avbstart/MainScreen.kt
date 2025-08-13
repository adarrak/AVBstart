package com.example.avbstart

import Standart_Items.ButtonExample
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avbstart.ui.theme.*

@Composable
fun MainScreen(navController: NavController, innerPadding: PaddingValues) {


    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(color = myBackground)
            .padding(innerPadding)
    ) {
        AppName()
        AppLogo()
        RegisterButtons(navController)
    }
}


@Composable
fun AppName() {
    Box(
        modifier = Modifier
            .padding(top = 108.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            Text(
                text = "Sign UP",
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = "report",
                fontSize = 35.sp,
                fontStyle = FontStyle.Italic,
                letterSpacing = -0.5.sp,
                modifier = Modifier
                    .align(Alignment.BottomEnd)
                    .offset(x = -6.dp, y = 25.dp)
            )
        }
    }
}

@Composable
fun AppLogo() {
    Box(
        modifier = Modifier
            .padding(top = 58.dp)
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .background(myBackground)
                .height(236.dp)
                .width(236.dp)
                .clip(shape = RoundedCornerShape(16.dp))
                .border(
                    width = 1.dp,
                    color = myBorderColor,
                    shape = RoundedCornerShape(16.dp)
                )
                .align(Alignment.TopCenter)
        ) {
            Image(
                painter = painterResource(R.drawable.logo_avb),
                contentDescription = "logo",
                modifier = Modifier.align(Alignment.Center)
            )
        }
    }
}

@Composable
fun RegisterButtons(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 57.dp)
            .fillMaxWidth()
    ) {
        ButtonExample(
            titleName = "Login"
        )
        ButtonExample(
            titleName = "Sign up",
            paddingTopButton = 32.dp,
            onClick = {
                navController.navigate("RegistrationStep1")
            }
        )
    }
}



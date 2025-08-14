package com.example.avbstart

import Standart_Items.RoleCard
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avbstart.ui.theme.myBackground
import com.example.avbstart.ui.theme.myBorderColor
import com.example.avbstart.ui.theme.myGradientColor1

@Composable
fun ScreenRegistrationStep1(navController: NavController) {
    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = myBackground
    ) {
        ChooseRole(navController)
        DrawLogo()
    }
}


@Composable
fun ChooseRole(navController: NavController) {

    Card(
        modifier = Modifier
            .padding(
                top = 140.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = 88.dp
            )
            .fillMaxSize(),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = myBorderColor),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = myBackground
        ),
    ) {
        Column(
            modifier = Modifier

                .fillMaxSize()
        ) {
            //Box с text = "Step 1/4" и text = "Select your role for registration"
            Box(
                modifier = Modifier
                    .padding(start = 16.dp, end = 16.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            )
            {
                Text(
                    text = "Step 1/4",
                    fontSize = 14.sp,
                    color = myGradientColor1,
                    modifier = Modifier
                        .padding(top = 16.dp)
                )

                Text(
                    text = "Select your role\nfor registration",
                    modifier = Modifier
                        .padding(top = 80.dp)
                        .align(Alignment.Center),
                    textAlign = TextAlign.Center,
                    fontSize = 24.sp,
                    fontWeight = FontWeight.Bold
                )
            }

            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.SpaceBetween,
                modifier = Modifier
                    .padding(24.dp)
                    .fillMaxSize()


            ) {
                RoleCard(
                    nameOfRole = "School or University",
                    imageResource = R.drawable.univer,
                    onClick = {
                        navController.navigate("RegistrationStep2")
                    }
                )
                RoleCard(
                    nameOfRole = "Founder",
                    imageResource = R.drawable.idea_1
                )
                RoleCard(
                    nameOfRole = "Co-builder",
                    imageResource = R.drawable.hat1
                )
            }
        }


    }
}

@Composable
fun DrawLogo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 71.dp),
        contentAlignment = Alignment.TopCenter
    ) {
        Card(
            modifier = Modifier
                .size(width = 103.dp, height = 103.dp),
            border = BorderStroke(width = 1.dp, color = myBorderColor),
            shape = RoundedCornerShape(16.dp),
            colors = CardDefaults.cardColors(
                containerColor = myBackground
            ),
            elevation = CardDefaults.cardElevation(
                defaultElevation = 2.dp
            ),
        )
        {
            Box(
                modifier = Modifier
                    .padding(top = 24.dp)
                    .fillMaxSize()
                //.background(Color.Red)
            ) {

                Image(
                    painter = painterResource(id = R.drawable.register_logo_avb),
                    contentDescription = "Logo Image",
                    modifier = Modifier.fillMaxSize()
                )
            }


        }
    }
}


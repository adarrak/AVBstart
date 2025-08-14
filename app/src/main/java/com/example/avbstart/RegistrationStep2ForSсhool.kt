package com.example.avbstart

import Standart_Items.BlueButton
import Standart_Items.ButtonExample
import Standart_Items.RegistrationTextField
import Standart_Items.RoleCard
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avbstart.ui.theme.myBackground
import com.example.avbstart.ui.theme.myBorderColor
import com.example.avbstart.ui.theme.myGradientColor1

@Composable
fun ScreenRegistrationStep2() {

    Scaffold()
    { innerPadding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .background(color = myBackground)
                .padding(innerPadding)

        ) {
            LazyColumn(

            ) {
                item { DrawLogo() }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }
                item { RegistrationTextField(nameOfField = "First Name") }

            }


        }
    }

}

@Composable
fun AskFormForRegistrationStep2() {
    Card(
        modifier = Modifier
            .padding(
                top = 140.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = 61.dp
            ),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = myBorderColor),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 2.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = myBackground
        )
    ) {
        LazyColumn(
            modifier = Modifier
                .padding(
                    top = 16.dp,
                    start = 16.dp,
                    end = 16.dp,
                    bottom = 32.dp
                )
                .fillMaxSize()
        ) {
            item {
                Box(
                    modifier = Modifier
                        .fillMaxWidth(),
                    contentAlignment = Alignment.TopEnd
                ) {
                    Text(
                        text = "Step 2/4",
                        fontSize = 14.sp,
                        color = myGradientColor1,


                        )
                }
            }
            item {
                Box(

                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 47.dp),
                    contentAlignment = Alignment.TopCenter
                ) {
                    Text(
                        text = "Enter your details to\n" +
                                "complete the registration",
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
            item { RegistrationTextField(nameOfField = "First Name") }
            item { RegistrationTextField(nameOfField = "Last Name") }
            item { RegistrationTextField(nameOfField = "E-mail") }
            item { RegistrationTextField(nameOfField = "School Name") }
            item { RegistrationTextField(nameOfField = "Phone Number") }
            item { RegistrationTextField(nameOfField = "Password") }
            item {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 24.dp)
                        .height(114.dp),
                    verticalArrangement = Arrangement.SpaceBetween
                ) {
                    BlueButton(titleName = "Confirm")
                    Text(
                        text = "By pressing Register, " +
                                "you are agree to our Terms&\n" +
                                "Conditions and Privacy Policy",
                        fontSize = 11.sp,
                        textAlign = TextAlign.Center,
                        modifier = Modifier
                            .align(Alignment.CenterHorizontally)

                    )

                }
            }
        }
    }
}

@Composable
@Preview
fun ScreenRegistrationStep2Prew() {
    ScreenRegistrationStep2()
}
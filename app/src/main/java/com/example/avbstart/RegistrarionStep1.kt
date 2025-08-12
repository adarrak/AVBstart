package com.example.avbstart

import Standart_Items.RoleCard
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import org.w3c.dom.Text
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import com.example.avbstart.ui.theme.myBackground
import com.example.avbstart.ui.theme.myBorderColor
import com.example.avbstart.ui.theme.myGradientColor1

@Composable
fun ScreenRegistrationStep1() {
    DrawLogo()
    ChooseRole()

}

@Composable
fun ChooseRole() {
    Box(
        modifier = Modifier
            .padding(top = 140.dp)
    ) {
        Box(
            modifier = Modifier
                .size(width = 352.dp, height = 603.dp)
                .align(Alignment.TopCenter)
                .border(
                    width = 1.dp,
                    color = myBorderColor,
                    shape = RoundedCornerShape(16.dp)
                )
                .clip(shape = RoundedCornerShape(16.dp))
        ) {
            Column (
                modifier = Modifier
                    .fillMaxSize(),
                    horizontalAlignment = Alignment.CenterHorizontally
            ){
                Text(
                    text = "Step 1/4",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(16.dp),
                    textAlign = TextAlign.End,
                    fontSize = 14.sp,
                    color = myGradientColor1
                )
                Box(modifier = Modifier
                    .padding(top = 47.dp)
                    .size(width = 200.dp, height = 58.dp)
                ) {
                    Text(
                        text = "Select your role for registration",
                        modifier = Modifier

                            .fillMaxWidth(),
                        textAlign = TextAlign.Center,
                        fontSize = 24.sp,
                        fontWeight = FontWeight.Bold
                    )

                }
                Column {
                    RoleCard()
                    RoleCard()
                    RoleCard()

                }

            }
        }
    }
}

@Composable
fun DrawLogo() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 71.dp)
            .size(width = 103.dp, height = 103.dp),
        contentAlignment = Alignment.TopCenter

    ) {
        Image(
            painter = painterResource(id = R.drawable.register_logo_avb),
            contentDescription = "Logo Image"
        )
    }
    Box(
        modifier = Modifier.padding(top = 140.dp)
    ) {
        Column() { }
    }
}


@Composable
@Preview(showBackground = true)
fun ScreenRegistrationStep1Prev() {
    ScreenRegistrationStep1()
}
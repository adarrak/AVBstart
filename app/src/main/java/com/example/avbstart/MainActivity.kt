package com.example.avbstart

import Standart_Items.ButtonExample
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.avbstart.ui.theme.myBackground
import com.example.avbstart.ui.theme.myBorderColor

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
//необходимо переделать реализацию перехода экранов


            val userNumberPage by remember { mutableStateOf(0) }
            Surface(
                modifier = Modifier.fillMaxSize(),
                color = myBackground
            ) {

                UserStatusBar()
                when (userNumberPage) {
                    0 -> {
                        AppName()
                        AppLogo()
                        RegisterButtons()
                    }

                    1 -> {
                        ScreenRegistrationStep1()
                    }
                }
            }
        }
    }
}

@Composable
fun UserStatusBar(
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .height(47.dp)

    ) {}
}

@Composable
fun AppName() {
    Box {
        Text(
            text = "Sign UP",
            fontSize = 70.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(top = 154.dp, start = 67.dp)
        )
    }
    Box {
        Text(
            text = "report",
            fontSize = 35.sp,
            fontStyle = FontStyle.Italic,
            modifier = Modifier.padding(top = 221.dp, start = 217.dp)
        )
    }
}

@Composable
fun AppLogo() {
    Box(
        modifier = Modifier
            .padding(top = 296.dp)
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
fun RegisterButtons() {

    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
            .padding(top = 589.dp)
            .fillMaxWidth()


    ) {
        ButtonExample(
            titleName = "Login",
            onClick = {}
        )
        ButtonExample(
            titleName = "Sign up",
            paddingTopButton = 32.dp
        )

    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {

    UserStatusBar()
    AppName()
    AppLogo()
    RegisterButtons()
}
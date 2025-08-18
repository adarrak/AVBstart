package ui.screens.main

import ui.components.ButtonExample
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avbstart.R
import ui.components.BoxWithLogo
import ui.theme.*

@Composable
fun MainScreen(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = myBackground)
            .padding(
                top = 154.dp,
                bottom = 98.dp
            )
    ) {
        Column(
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        ) {
            OnStartScreenAppName()
            BoxWithLogo(
                icon = R.drawable.logo_avb,
                sizeOfBox = 236.dp,
                sizeOfImage = 150.dp
            )
            RegisterButtons(navController)
        }
    }
}

@Composable
fun OnStartScreenAppName() {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .align(Alignment.Center)
        ) {
            Text(
                text = stringResource(R.string.main_screen_sign),
                fontSize = 70.sp,
                fontWeight = FontWeight.Bold
            )
            Text(
                text = stringResource(R.string.main_screen_report),
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
fun RegisterButtons(navController: NavController) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier
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




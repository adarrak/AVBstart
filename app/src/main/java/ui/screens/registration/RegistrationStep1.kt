package ui.screens.registration

import ui.components.RoleCard
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.*
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material3.Text
import androidx.compose.ui.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.avbstart.R
import ui.components.BoxWithLogo
import ui.components.DefaultCard
import ui.theme.*


@Composable
fun ScreenRegistrationStep1(navController: NavController) {


    Surface(
        modifier = Modifier
            .fillMaxSize(),
        color = myBackground
    ) {
        ChooseRole(navController)
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .padding(top = 71.dp),
            contentAlignment = Alignment.TopCenter
        ) {
            BoxWithLogo(icon = R.drawable.register_logo_avb)
        }
    }
}


@Composable
fun ChooseRole(navController: NavController) {

    DefaultCard (
        modifier = Modifier
            .padding(
                top = 140.dp,
                start = 16.dp,
                end = 16.dp,
                bottom = 88.dp
            )
    ){
        Column(
            modifier = Modifier

                .fillMaxSize()
        ) {
            //Box с text = "Step 1/4" и text = "Select your role for registration"
            Box(
                modifier = Modifier
                    .padding( 16.dp)
                    .fillMaxWidth(),
                contentAlignment = Alignment.TopEnd
            )
            {
                Text(
                    text = stringResource(R.string.registration_step1_of_4),
                    fontSize = 14.sp,
                    color = myGradientColor1,
                    modifier = Modifier
                        .padding(top = 16.dp)

                )

                Text(
                    text = stringResource(R.string.chose_role_text),
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
                    nameOfRole = stringResource(R.string.school_or_university),
                    imageResource = R.drawable.univer,
                    onClick = {
                        navController.navigate("RegistrationStep2")
                    }
                )
                RoleCard(
                    nameOfRole = stringResource(R.string.founder),
                    imageResource = R.drawable.idea_1
                )
                RoleCard(
                    nameOfRole = stringResource(R.string.co_builder),
                    imageResource = R.drawable.hat1
                )
            }
        }


    }
}


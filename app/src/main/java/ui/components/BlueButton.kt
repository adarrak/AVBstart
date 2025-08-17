package ui.components

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import ui.theme.myBackgroundAktive
import ui.theme.myWhiteText

@Composable
fun BlueButton(titleName: String = "C") {

    Box(
        modifier = Modifier
            .height(56.dp)
            .fillMaxWidth()
    ) {
        Button(
            onClick = {},
            modifier = Modifier
                .fillMaxSize(),
            enabled = true,
            shape = RoundedCornerShape(20.dp),
            colors = ButtonDefaults.buttonColors(
                contentColor = myWhiteText,
                containerColor = myBackgroundAktive
            ),
            elevation = ButtonDefaults
                .buttonElevation(defaultElevation = 2.dp)
        ) {
            Text(
                text = titleName,
                fontSize = 18.sp,
                fontWeight = FontWeight.Bold,
                letterSpacing = 0.05.em,
                modifier = Modifier
            )

        }

    }
}


package ui.components

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.*
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import ui.theme.myBackground
import ui.theme.myColorOtherText
import ui.theme.myGradientColor1
import ui.theme.myGradientColor2
import ui.theme.myGradientColor3
import ui.theme.myTextFieldBackground

@Composable
fun RegistrationTextField(
    nameOfField: String = "Error"
) {
    val gradientBrush = Brush.horizontalGradient(
        colors = listOf(
            myGradientColor1,
            myGradientColor2,
            myGradientColor3
        )

    )
    var text by remember { mutableStateOf(value = "") }
    Box(
        modifier = Modifier
            .fillMaxWidth()
            .padding(top = 24.dp)
            .height(height = 60.dp)
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it},
            singleLine = true,
            textStyle = TextStyle(
                fontSize = 18.sp
            ),
            modifier = Modifier
                .fillMaxSize()
                .clip(shape = RoundedCornerShape(size = 20.dp))
                .border(
                    width = 2.dp,
                    brush = gradientBrush,
                    shape = RoundedCornerShape(size = 20.dp)
                )
                .background(color = myTextFieldBackground)
        )
        Box(Modifier.padding(start = 32.dp)) {

            Text(
                text = nameOfField,
                fontSize = 11.sp,
                letterSpacing = 0.05.em,
                color = myColorOtherText,
                modifier = Modifier
                    .offset(y = -9.dp)
                    .background(color = myBackground)
                    .padding(horizontal = 8.dp, vertical = 2.dp)
            )

        }
    }

}

@Composable
@Preview(showBackground = true)
fun RegistrationTextFieldPrew() {
    RegistrationTextField()

}
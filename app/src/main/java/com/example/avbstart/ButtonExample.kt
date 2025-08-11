package com.example.avbstart

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.example.avbstart.ui.theme.myBackground
import com.example.avbstart.ui.theme.myGradientColor1
import com.example.avbstart.ui.theme.myGradientColor2
import com.example.avbstart.ui.theme.myGradientColor3
import com.example.avbstart.ui.theme.myTextColor


@Composable
fun ButtonExample(
    titleName: String = "Title",
    paddingTopButton: Dp = 0.dp
) {
    val gradientBrush = Brush.horizontalGradient(
        colors = listOf(
            myGradientColor1,
            myGradientColor2,
            myGradientColor3
        )
    )
    Button(
        onClick = {},
        modifier = Modifier
            .padding(top = paddingTopButton)
            .size(width = 300.dp, height = 56.dp),
        enabled = true,
        shape = RoundedCornerShape(20.dp),
        colors = ButtonDefaults.buttonColors(
            contentColor = myTextColor,
            containerColor = Color.Transparent
        ),
        border = BorderStroke(1.dp, brush = gradientBrush)


    ) {
        Text(text = titleName,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            letterSpacing = 0.05.em,
            modifier = Modifier)
    }
}

@Composable
@Preview
fun ButtonExamplePre() {
    ButtonExample("Login",32.dp)
}
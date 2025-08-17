package ui.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import ui.theme.*

@Composable
fun BoxWithLogo(
    icon: Int,
    sizeOfBox: Dp = 103.dp,
    sizeOfImage: Dp = 79.dp
) {
    Box(
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Box(
            modifier = Modifier
                .size(sizeOfBox)
                .border(
                    width = 1.dp,
                    color = myBorderColor,
                    shape = RoundedCornerShape(16.dp)
                )
                .align(Alignment.TopCenter)
                .shadow(
                    elevation = 10.dp,
                    clip = true,
                    shape = RoundedCornerShape(16.dp),
                    ambientColor = myAmbientColor,
                )
                .background(myBackground, shape = RoundedCornerShape(16.dp))
        ) {
            Image(
                painter = painterResource(icon),
                contentDescription = "logo",
                modifier = Modifier
                    .size(sizeOfImage)
                    .align(Alignment.Center)
            )
        }
    }
}

package ui.components

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import ui.theme.myBackground
import ui.theme.myBorderColor

@Composable
fun DefaultCard(
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Card(
        modifier = modifier
            .clip(shape = RoundedCornerShape(16.dp)),
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = myBorderColor),
        colors = CardDefaults.cardColors(
            containerColor = myBackground
        ),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
    ) {
        content()
    }
}

@Composable
@Preview
fun DefaultCardPrew() {
    DefaultCard { Text(text = "Hello") }
}
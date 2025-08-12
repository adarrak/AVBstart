package Standart_Items

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Card
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.avbstart.R

@Composable
fun RoleCard(){
    Card (
        modifier = Modifier
            .size(width = 304.dp, height = 131.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.univer),
            contentDescription = "Image of role")
        Text(text = "asdagfag")
    }
}


@Composable
@Preview
fun RoleCardPrew(){
    RoleCard()
}
package ui.components

import android.util.Log
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.avbstart.R
import ui.theme.myBackground
import ui.theme.myBorderColor
import ui.theme.myColorOtherText

@Composable
fun RoleCard(
    nameOfRole: String,
    imageResource: Int,
    onClick: () -> Unit = {
        Log.d("myLog", "нажата $nameOfRole")
    }
) {
    Card(
        shape = RoundedCornerShape(16.dp),
        border = BorderStroke(width = 1.dp, color = myBorderColor),
        elevation = CardDefaults.cardElevation(
            defaultElevation = 10.dp
        ),
        colors = CardDefaults.cardColors(
            containerColor = myBackground
        ),
        modifier = Modifier
            .fillMaxWidth()
            .height(height = 131.dp)
            .clip(shape = RoundedCornerShape(16.dp))
            .clickable { onClick() }
    ) {
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceBetween,
            modifier = Modifier
                .fillMaxSize()
        )
        {
            Box(
                modifier = Modifier
                    .padding(
                        top = 12.dp,
                        start = 12.dp,
                        end = 12.dp
                    )
                    .fillMaxWidth()
                    .height(height = 80.dp),
                contentAlignment = Alignment.Center
            )
            {
                Image(
                    painter = painterResource(imageResource),
                    contentDescription = "Image of role",
                )
            }
            Text(
                text = nameOfRole,
                color = myColorOtherText,
                fontSize = 14.sp,
                modifier = Modifier
                    .padding(bottom = 12.dp)
            )
        }
    }
}


@Composable
@Preview
fun RoleCardPrew() {
    RoleCard(
        nameOfRole = "School or University",
        imageResource = R.drawable.univer
    )
}
package com.example.whatsappjetpackcompose.presentation.updatescreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.model.channelmodel.ChannelModel

@Composable
fun ChannelItem(channelModel: ChannelModel) {
    var isFollowed by remember { mutableStateOf(false) }

    Row(
        horizontalArrangement = Arrangement.Start,
        verticalAlignment = Alignment.CenterVertically,
        modifier = Modifier
            .padding(end = 16.dp, bottom = 12.dp)
            .fillMaxWidth()  // Ensures full width for consistent alignment
    ) {
        Image(
            painter = painterResource(channelModel.image),
            contentDescription = "",
            modifier = Modifier.size(50.dp),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(modifier = Modifier.weight(1f)) {  // Ensures text takes available width
            Text(
                text = channelModel.name,
                fontWeight = FontWeight.Bold,
                fontSize = 14.sp,
                color = Color.Black
            )
            Text(text = channelModel.description, color = Color.Gray, fontSize = 12.sp)
        }

        Spacer(modifier = Modifier.weight(1f))  // Pushes button to the end uniformly

        Button(
            onClick = { isFollowed = !isFollowed },
            colors = ButtonDefaults.buttonColors(
                containerColor = if (isFollowed) Color.Gray
                else colorResource(R.color.whatsapp_medium_green)
            ),
            modifier = Modifier.padding(start = 8.dp)
        ) {
            Text(
                text = if (isFollowed) "Followed" else "Follow",
                fontSize = 12.sp
            )
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun Default1(

) {
    ChannelItem(channelModel = ChannelModel(R.drawable.man, "Akhilesh", "Tap to add status update"))

}
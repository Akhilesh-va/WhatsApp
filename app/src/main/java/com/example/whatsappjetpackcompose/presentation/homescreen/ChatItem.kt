package com.example.whatsappjetpackcompose.presentation.homescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.model.chatmodel.ChatModel


@Composable
fun ChatItem(
    chatModel: ChatModel
) {

        Row(modifier = Modifier.padding(8.dp), verticalAlignment = Alignment.CenterVertically) {

            Image(
                painter = painterResource(chatModel.image),
                contentDescription = "",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .size(60.dp)
                    .clip(CircleShape)
                    .border(2.dp, Color.Gray, CircleShape))
            Spacer(modifier = Modifier.width(12.dp))

            Column {
                Row {
                    Text(text = chatModel.name,
                        style = TextStyle(fontWeight = FontWeight.Bold  , fontSize = 18.sp),
                        modifier = Modifier.align(Alignment.Top).weight(1f))

                    Text(text = chatModel.time,
                        style = TextStyle(fontWeight = FontWeight.Medium  , fontSize = 14.sp))

                }
                Spacer(modifier = Modifier.height(2.dp))
                Text(text = chatModel.message,
                    style = TextStyle(fontWeight = FontWeight.Normal  , fontSize = 14.sp))


        }

        }


}
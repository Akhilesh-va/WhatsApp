package com.example.whatsappjetpackcompose.presentation.updatescreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.R

@Preview(showSystemUi = true)
@Composable
fun MyStatusItem() {
    Row(verticalAlignment = Alignment.CenterVertically ,
        horizontalArrangement = Arrangement.Center,
        modifier = Modifier.padding(8.dp)

        ) {
        Box() {
            Image(
                painter = painterResource(R.drawable.bhuvan_bam), " ",
                modifier = Modifier.clip(
                    CircleShape
                ).border(2.dp, Color.Gray,CircleShape).size(60.dp), contentScale = ContentScale.Crop

            )
            Box(
                modifier = Modifier
                    .size(30.dp)
                    .background(colorResource(R.color.whatsapp_medium_green),
                        shape = CircleShape)
                    .padding(3.dp).align(Alignment.BottomEnd)
            ) {
                Icon(
                    imageVector = Icons.Default.Add,
                    contentDescription = null,
                    tint = Color.White,
                    modifier = Modifier.size(24.dp),

                )

            }

        }
        Spacer(modifier = Modifier.width(12.dp))
        Column(modifier = Modifier.align(Alignment.CenterVertically)) {
            Row {
                Text(
                    text = "My Status",
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 22.sp),
                    modifier = Modifier
                        .align(Alignment.Top)
                        .weight(1f), color = Color.Black
                )


            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = "Tap to add status update",
                style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 14.sp), color = Color.Gray
            )


        }
    }

}
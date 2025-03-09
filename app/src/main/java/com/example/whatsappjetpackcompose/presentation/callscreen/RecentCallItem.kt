package com.example.whatsappjetpackcompose.presentation.callscreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Call
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.model.recentcallmodel.RecentCallModel


@Composable
fun RecentCallItem(recentCallModel: RecentCallModel) {
    Row(modifier = Modifier.padding(10.dp),
        verticalAlignment = Alignment.CenterVertically,
        ) {
        Image(
            painter = painterResource(recentCallModel.image),
            "",
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )
        Spacer(modifier = Modifier.width(10.dp))
        Column(verticalArrangement = Arrangement.Center ,
            horizontalAlignment = Alignment.Start,
            modifier = Modifier.weight(1f)) {
            Text(
                text = recentCallModel.name,

                fontWeight = FontWeight.Bold,
                fontSize = 16.sp
            )

            Row {
                Image(painter = painterResource(R.drawable.baseline_call_missed_24),""
                , modifier = Modifier.size(15.dp),colorFilter = ColorFilter.tint(Color.Gray))
                Text(text = recentCallModel.time, fontSize = 14.sp, fontWeight = FontWeight.Normal
                , color = Color.Gray)
            }
        }

        Icon(imageVector = Icons.Default.Call,"",tint = Color.White)
    }


}
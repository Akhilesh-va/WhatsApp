package com.example.whatsappjetpackcompose.presentation.updatescreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.model.statusmodel.StatusModel

@Composable
fun StatusItem(statusModel: StatusModel) {
    Row(modifier = Modifier.fillMaxWidth().padding(8.dp), verticalAlignment = Alignment.CenterVertically) {

        Image(
            painter = painterResource(statusModel.image),
            contentDescription = "",
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .size(60.dp)
                .clip(CircleShape)
                .border(2.dp, Color.Gray, CircleShape)
        )
        Spacer(modifier = Modifier.width(12.dp))

        Column {
            Row {
                Text(
                    text = statusModel.name,
                    style = TextStyle(fontWeight = FontWeight.Bold, fontSize = 22.sp),
                    modifier = Modifier
                        .align(Alignment.Top)
                        .weight(1f), color = Color.Black
                )


            }
            Spacer(modifier = Modifier.height(2.dp))
            Text(
                text = statusModel.time,
                style = TextStyle(fontWeight = FontWeight.Normal, fontSize = 14.sp), color = Color.Gray
            )


        }
    }

}

@Preview(showSystemUi = true)
@Composable
 fun Default(

) {
     StatusItem(statusModel = StatusModel(R.drawable.man,"Akhilesh" , "Tap to add status update"))

}
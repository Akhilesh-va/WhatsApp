package com.example.whatsappjetpackcompose.presentation.callscreen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.model.favouritecallmodel.FavouritesCallModel


@Composable
 fun FavouriteCallItem(favCallModel: FavouritesCallModel) {
    Column(modifier = Modifier.padding(8.dp ,0.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center) {
        Image(painter = painterResource(favCallModel.image) ,"",
            modifier = Modifier.size(60.dp).clip(CircleShape), contentScale = ContentScale.Crop)

        Text(text=favCallModel.name , fontWeight = FontWeight.Bold)
    }


}
package com.example.whatsappjetpackcompose.common

import androidx.compose.foundation.layout.size
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.example.whatsappjetpackcompose.R

@Composable
fun FloatingComposable(image : Int) {
    FloatingActionButton(
        onClick = {},
        containerColor = colorResource(R.color.whatsapp_light_green)
        , contentColor = Color.White,
        modifier = Modifier.size(65.dp)


    ) {
        Icon(painter = painterResource(image), contentDescription = "Chat",
            modifier = Modifier.size(28.dp)
        )

    }

}
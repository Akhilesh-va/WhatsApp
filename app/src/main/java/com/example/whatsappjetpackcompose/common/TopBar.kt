package com.example.whatsappjetpackcompose.common
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview

import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.R
import kotlin.math.sin

@Composable
fun TopBar(text: String) {

    var isSearching by remember {
        mutableStateOf(false)
    }
    var search by remember {
        mutableStateOf("")
    }
    if (isSearching){
        TextField(value = search , onValueChange = {
            search = it

        }, placeholder = {
            Text(text="Search Here...")
        } , colors = TextFieldDefaults.colors(
            focusedContainerColor = Color.Transparent,
            unfocusedContainerColor = Color.Transparent
            , focusedIndicatorColor = Color.Transparent,
            unfocusedIndicatorColor = Color.Transparent,

            ), modifier = Modifier.padding(start = 12.dp).fillMaxWidth(), singleLine = true)

    }else{
        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                text = text, fontSize = 28.sp,
                color = colorResource(R.color.whatsapp_medium_green),
                modifier = Modifier
                    .align(Alignment.CenterStart)
                    .padding(start = 16.dp),
                fontWeight = FontWeight.Bold
            )

            Row(modifier = Modifier.align(Alignment.CenterEnd)) {
                IconButton(onClick = {

                }) {

                    Icon(
                        painter = painterResource(R.drawable.camera),
                        contentDescription = "Camera",
                        modifier = Modifier.size(28.dp)
                    )
                }
                Spacer(modifier = Modifier.width(15.dp))
                IconButton(onClick = {
                    isSearching =!isSearching

                }) {
                    Icon(
                        painter = painterResource(R.drawable.search),
                        contentDescription = "Search",
                        modifier = Modifier.size(28.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
                IconButton(onClick = {

                }) {
                    Icon(
                        painter = painterResource(R.drawable.more),
                        contentDescription = "more",
                        modifier = Modifier.size(28.dp)
                    )
                }
                Spacer(modifier = Modifier.width(10.dp))
            }

        }

    }


}

@Preview(showSystemUi = true)
@Composable
private fun Default() {
    TopBar("Updates")

}
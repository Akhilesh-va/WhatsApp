package com.example.whatsappjetpackcompose.presentation.callscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.common.FloatingComposable
import com.example.whatsappjetpackcompose.common.TopBar
import com.example.whatsappjetpackcompose.model.favouritecallmodel.FavouritesCallModel
import com.example.whatsappjetpackcompose.model.recentcallmodel.RecentCallModel
import com.example.whatsappjetpackcompose.presentation.bottomnavigation.BottomNavigation


@Composable
fun CallScreen(navController: NavController) {
    val moreCallData = listOf("Clear call log" ,"Setting")
    val favouriteCallData = listOf(
        FavouritesCallModel(R.drawable.man, "Bhuvan Bam"),
        FavouritesCallModel(R.drawable.carryminati, "Career Backup"),
        FavouritesCallModel(R.drawable.bhuvan_bam, "Tech Sikhooo"),
        FavouritesCallModel(R.drawable.man, "Manly Hood"),
        FavouritesCallModel(R.drawable.woman, "Womanly Hood")
    )
    val recentCallData = listOf(
        RecentCallModel(
            image = R.drawable.man,
            name = "Bhuvan Bam",
            time = "Yesterday, 8:30 PM"
        ),
        RecentCallModel(
            image = R.drawable.carryminati,
            name = "Career Backup",
            time = "Today, 5:45 PM"
        ),
        RecentCallModel(
            image = R.drawable.bhuvan_bam,
            name = "Tech Sikhooo",
            time = "Yesterday, 7:15 PM"
        ),
        RecentCallModel(
            image = R.drawable.man,
            name = "Manly Hood",
            time = "Today, 3:00 PM"
        ),
        RecentCallModel(
            image = R.drawable.woman,
            name = "Womanly Hood",
            time = "Yesterday, 9:00 AM"
        )
    )

    Scaffold(
        floatingActionButton = { FloatingComposable(R.drawable.add_call) },
        bottomBar = { BottomNavigation(navController) }
    ) {
        Column(modifier = Modifier.padding(it)) {
            TopBar("Calls", moreCallData, R.color.primary_text)

            HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))
            Text(
                text = "Favourites",
                modifier = Modifier.padding(10.dp , 5.dp),
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 22.sp
            )
            LazyRow {
                items(favouriteCallData) {
                    FavouriteCallItem(favCallModel = it)
                }

            }
            Button(
                onClick = {},
                modifier = Modifier
                    .padding(10.dp , 15.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.whatsapp_medium_green))
            ) {
                Text(text = "Start a new call", fontSize = 16.sp)
            }
            Text(
                text = "Recent Calls",
                modifier = Modifier.padding(10.dp , 5.dp),
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 22.sp
            )
            LazyColumn { items(recentCallData) {
                RecentCallItem(recentCallModel = it)
            } }
        }
    }

}
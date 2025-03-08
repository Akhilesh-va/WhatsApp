package com.example.whatsappjetpackcompose.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.common.TopBar
import com.example.whatsappjetpackcompose.model.channelmodel.ChannelModel
import com.example.whatsappjetpackcompose.model.statusmodel.StatusModel
import com.example.whatsappjetpackcompose.presentation.bottomnavigation.BottomNavigation
import com.example.whatsappjetpackcompose.presentation.homescreen.FloatingComposable
@Composable
fun UpdateScreen() {

    val statusData = listOf(
        StatusModel(R.drawable.ajay_devgn, "Juban Kesari", "Just now"),
        StatusModel(R.drawable.kartik_aaryan, "Nillu", "10:11"),
        StatusModel(R.drawable.boy, "Murari", "5:45"),
        StatusModel(R.drawable.ajay_devgn, "Juban Kesari", "Just now"),
        StatusModel(R.drawable.kartik_aaryan, "Nillu", "10:11"),
        StatusModel(R.drawable.boy, "Murari", "5:45"),
    )

    val channelData = listOf(
        ChannelModel(R.drawable.neat_roots, "Neat Roots", "Android Development"),
        ChannelModel(R.drawable.man, "Manly hood", "All About Mens"),
        ChannelModel(R.drawable.boy, "Room", "The Dark Room"),
        ChannelModel(R.drawable.neat_roots, "Neat Roots", "Android Development"),
        ChannelModel(R.drawable.man, "Manly hood", "All About Mens"),
        ChannelModel(R.drawable.boy, "Room", "The Dark Room"),
    )

    var isFollowed by remember {
        mutableStateOf(false)
    }

    Scaffold(
        floatingActionButton = {
            FloatingComposable(R.drawable.baseline_photo_camera_24)
        },
        bottomBar = { BottomNavigation() }
    ) { paddingValues ->
        // Replacing Column with LazyColumn for scrollable content
        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            // TopBar Section
            item {
                TopBar(
                    text = "Updates",
                    options = listOf("Status Privacy", "Create Channel", "Settings")
                )
                HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))
            }

            // Status Header Section
            item {
                Text(
                    text = "Status",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    fontSize = 22.sp
                )
                MyStatusItem()
            }

            // Status List Section
            items(statusData) { status ->
                StatusItem(statusModel = status)
            }

            // Divider between Status and Channels
            item {
                Spacer(modifier = Modifier.height(16.dp))
                HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = "Channels",
                    modifier = Modifier.padding(10.dp),
                    style = TextStyle(fontWeight = FontWeight.Bold),
                    fontSize = 22.sp
                )
                Spacer(modifier = Modifier.height(8.dp))
                Text(
                    text = " Stay updated on the topics that matter to you. Find channels to follow below",
                    modifier = Modifier.padding(horizontal = 12.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
                Text(
                    text = "Find Channels Below",
                    modifier = Modifier.padding(horizontal = 12.dp)
                )
                Spacer(modifier = Modifier.height(16.dp))
            }

            // Channel List Section
            items(channelData) { item ->
                ChannelItem(channelModel = item)
            }
        }
    }
}



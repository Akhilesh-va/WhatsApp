package com.example.whatsappjetpackcompose.presentation.commuinitiesscreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
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
import com.example.whatsappjetpackcompose.common.TopBar
import com.example.whatsappjetpackcompose.model.communitiesmodel.CommunitiesModel
import com.example.whatsappjetpackcompose.presentation.bottomnavigation.BottomNavigation


@Composable
fun CommunitiesScreen(navController: NavController) {
    val moreCommunityData = listOf("Setting")

    val communityData = listOf(
        CommunitiesModel(R.drawable.carryminati ,"Career Backup" ,"184M members"),
        CommunitiesModel(R.drawable.bhuvan_bam ,"Tech Sikhooo" ,"4M members"),
        CommunitiesModel(R.drawable.man, "Manly Hood", "34M members"),
        CommunitiesModel(R.drawable.woman, "Womanly Hood", "12M members")
    )
    Scaffold(
        bottomBar = { BottomNavigation(navController) }



    ) {
        Column(modifier = Modifier.padding(it)) {
            TopBar("Communities", moreCommunityData, R.color.primary_text)
            HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))

            Button(
                onClick = {},
                modifier = Modifier
                    .padding(10.dp)
                    .fillMaxWidth(),
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.whatsapp_medium_green))
            ) {
                Text(text = "Start a new community", fontSize = 16.sp)
            }

            Text(
                text = "Your Communities",
                modifier = Modifier.padding(10.dp),
                style = TextStyle(fontWeight = FontWeight.Bold),
                fontSize = 22.sp
            )
            LazyColumn(modifier = Modifier
                .padding(10.dp)
                .fillMaxWidth()) { items(communityData) { items->
                CommunitiesItem(communityModel = items)
            } }
        }
    }

}
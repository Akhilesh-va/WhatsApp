package com.example.whatsappjetpackcompose.presentation.bottomnavigation

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ModifierLocalBeyondBoundsLayout
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.presentation.navigation.Routes


@Composable
 fun BottomNavigation(navController: NavController) {
    BottomAppBar(tonalElevation = 12.dp , containerColor = Color.Black
        ) {

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp, 0.dp),
            horizontalArrangement = Arrangement.SpaceBetween) {
            Column(modifier = Modifier.padding(top=10.dp),
                horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = { navController.navigate(Routes.HomeScreen)}) {
                    Icon(painter = painterResource(R.drawable.outline_chat_24),"",
                        modifier = Modifier.size(30.dp)
                    )

                }
                Text(text="Chats" , modifier = Modifier.align(Alignment.CenterHorizontally),
                    style = TextStyle(fontWeight = FontWeight.Bold))

            }
            Column(modifier = Modifier.padding(top=10.dp) ,horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {navController.navigate(Routes.UpdateScreen) }) {
                    Icon(painter = painterResource(R.drawable.update_icon),"",
                        modifier = Modifier.size(30.dp)
                    )

                }
                Text(text="Updates" , modifier = Modifier.align(Alignment.CenterHorizontally),
                    style = TextStyle(fontWeight = FontWeight.Bold))

            }
            Column(modifier = Modifier.padding(top=10.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = {navController.navigate(Routes.CommunitiesScreen) }) {
                    Icon(painter = painterResource(R.drawable.communities_icon),"",
                        modifier = Modifier
                            .size(30.dp)
                            .align(Alignment.CenterHorizontally)
                    )

                }
                Text(text="Communities" , modifier = Modifier.align(Alignment.CenterHorizontally),
                    style = TextStyle(fontWeight = FontWeight.Bold))

            }
            Column(modifier = Modifier.padding(top=10.dp),horizontalAlignment = Alignment.CenterHorizontally) {
                IconButton(onClick = { navController.navigate(Routes.CallScreen)}) {
                    Icon(painter = painterResource(R.drawable.add_call),"",
                        modifier = Modifier.size(30.dp)
                    )

                }
                Text(text="Calls" , modifier = Modifier.align(Alignment.CenterHorizontally),
                    style = TextStyle(fontWeight = FontWeight.Bold))

            }
        }





    }

}
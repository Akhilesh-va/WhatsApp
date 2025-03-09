package com.example.whatsappjetpackcompose.presentation.user_registration_screen

import android.content.Intent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Icon
import androidx.compose.material3.LocalTextStyle
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.focus.focusModifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.input.pointer.motionEventSpy
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.presentation.navigation.Routes
import java.nio.file.WatchEvent
import kotlin.random.Random


@Composable
fun UserRegistrationScreen(navController: NavController) {
    var expanded by remember { mutableStateOf(false) }
    var selectedCountry by remember { mutableStateOf("India") }
    var countryCode by remember { mutableStateOf("+91") }
    var phoneNumber by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(24.dp , 80.dp)
            .imePadding(), // Handles keyboard overlap
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Enter Your Phone Number",
            style = TextStyle(fontSize = 20.sp, fontWeight = FontWeight.Bold),
            color = colorResource(R.color.whatsapp_medium_green)
        )
        Spacer(modifier = Modifier.height(24.dp))

        // Combined Row for better text alignment
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp) // Add padding to avoid clipping
                .background(Color.White), // White background for contrast
            horizontalArrangement = Arrangement.Center
        ) {
            Text(
                text = "What's",
                color = colorResource(R.color.whatsapp_medium_green),
                fontSize = 16.sp, // Visible size
                fontWeight = FontWeight.Bold // Emphasize text
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(
                text = "my number?",
                color = colorResource(R.color.whatsapp_medium_green),
                fontSize = 16.sp,
                fontWeight = FontWeight.Bold
            )
        }

        Spacer(modifier = Modifier.height(24.dp))

        TextButton(onClick = { expanded = true }, modifier = Modifier.fillMaxWidth()) {
            Box(modifier = Modifier.width(230.dp)) {
                Text(
                    text = selectedCountry,
                    modifier = Modifier.align(Alignment.Center),
                    style = TextStyle(fontSize = 16.sp),
                    color = Color.Black
                )
                Icon(
                    imageVector = Icons.Default.ArrowDropDown,
                    contentDescription = "",
                    modifier = Modifier.align(Alignment.CenterEnd),
                    tint = colorResource(R.color.whatsapp_light_green)
                )
            }
        }
        HorizontalDivider(
            color = colorResource(R.color.whatsapp_light_green),
            thickness = 2.dp,
            modifier = Modifier.width(250.dp)
        )

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false },
            modifier = Modifier
                .background(Color.White)
                .padding(0.dp, 10.dp, 0.dp, 170.dp)
        ) {
            listOf(
                "India", "USA", "UK", "UAE", "Australia", "Canada", "Russia"
            ).forEach { country ->
                DropdownMenuItem(
                    text = {
                        Text(
                            text = country,
                            style = TextStyle(fontSize = 16.sp, color = Color.Black)
                        )
                    },
                    onClick = {
                        selectedCountry = country
                        expanded = false
                    },
                    modifier = Modifier
                        .padding(horizontal = 8.dp)
                        .background(
                            color = if (country == selectedCountry) colorResource(R.color.whatsapp_background_light)
                            else Color.White
                        )
                )
            }
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row {
                TextField(
                    value = countryCode,
                    onValueChange = { countryCode = it },
                    modifier = Modifier.width(100.dp), // Increased width for visibility
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp, color = Color.Black), // Explicit text color
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(R.color.whatsapp_light_green),
                        focusedIndicatorColor = colorResource(R.color.whatsapp_light_green)
                    )
                )
                Spacer(modifier = Modifier.width(8.dp))

                TextField(
                    value = phoneNumber,
                    onValueChange = { phoneNumber = it },
                    placeholder = { Text(text = "Phone Number") },
                    keyboardOptions = KeyboardOptions.Default.copy(
                        keyboardType = KeyboardType.Number
                    ),
                    singleLine = true,
                    textStyle = LocalTextStyle.current.copy(fontSize = 18.sp),
                    colors = TextFieldDefaults.colors(
                        unfocusedContainerColor = Color.Transparent,
                        focusedContainerColor = Color.Transparent,
                        unfocusedIndicatorColor = colorResource(R.color.whatsapp_light_green),
                        focusedIndicatorColor = colorResource(R.color.whatsapp_light_green)
                    )
                )
            }
            Spacer(modifier = Modifier.height(16.dp))
            Row {
                Text(
                    text = "Carrier Charges may apply",
                    style = TextStyle(fontSize = 12.sp),
                    color = Color.Gray
                )
            }
            Spacer(modifier = Modifier.height(26.dp))
            Button(
                onClick = {
                        navController.navigate(Routes.HomeScreen)
                },
                colors = ButtonDefaults.buttonColors(containerColor = colorResource(R.color.whatsapp_medium_green)),
                shape = RoundedCornerShape(4.dp)
            ) {
                Text(text = "Next" , color=colorResource(R.color.primary_text))
            }
        }
    }
}


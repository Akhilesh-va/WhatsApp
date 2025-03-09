package com.example.whatsappjetpackcompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import com.example.whatsappjetpackcompose.model.statusmodel.StatusModel
import com.example.whatsappjetpackcompose.presentation.homescreen.HomeScreen
import com.example.whatsappjetpackcompose.presentation.navigation.Navigation
import com.example.whatsappjetpackcompose.presentation.updatescreen.UpdateScreen
import com.example.whatsappjetpackcompose.presentation.user_registration_screen.UserRegistrationScreen
import com.example.whatsappjetpackcompose.ui.theme.WhatsAppJetpackComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            WhatsAppJetpackComposeTheme {
                Navigation()

            }
        }
    }
}

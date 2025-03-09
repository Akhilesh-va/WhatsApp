package com.example.whatsappjetpackcompose.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.whatsappjetpackcompose.presentation.callscreen.CallScreen
import com.example.whatsappjetpackcompose.presentation.commuinitiesscreen.CommunitiesScreen
import com.example.whatsappjetpackcompose.presentation.homescreen.HomeScreen
import com.example.whatsappjetpackcompose.presentation.splashscreen.SplashScreen
import com.example.whatsappjetpackcompose.presentation.splashscreen.WelcomeScreen
import com.example.whatsappjetpackcompose.presentation.updatescreen.UpdateScreen
import com.example.whatsappjetpackcompose.presentation.user_registration_screen.UserRegistrationScreen


@Composable
fun Navigation() {
    val navController = rememberNavController()
    NavHost(startDestination = Routes.SplashScreen , navController=navController) {
        composable<Routes.SplashScreen> {
            SplashScreen(navController)
        }
        composable<Routes.WelcomeScreen> {
            WelcomeScreen(navController)
        }
        composable<Routes.UserRegistrationScreen> {
            UserRegistrationScreen(navController)
        }

        composable<Routes.HomeScreen> {
            HomeScreen(navController)
        }
        composable<Routes.UpdateScreen> {
            UpdateScreen(navController)
        }
        composable<Routes.CommunitiesScreen> {
            CommunitiesScreen(navController)
        }
        composable<Routes.CallScreen> {
            CallScreen(navController)
        }
    }



}
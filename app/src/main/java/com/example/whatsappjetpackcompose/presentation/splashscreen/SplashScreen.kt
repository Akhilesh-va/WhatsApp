package com.example.whatsappjetpackcompose.presentation.splashscreen


import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.presentation.navigation.Routes
import kotlinx.coroutines.delay


@Composable
fun SplashScreen(
    navController: NavController

) {

    LaunchedEffect(Unit) {
        delay(2000)
        navController.navigate(Routes.WelcomeScreen){
            popUpTo<Routes.SplashScreen>{inclusive=true}
        }

    }
    Box (modifier = Modifier.fillMaxSize().padding(16.dp)


    ){
       Image(painter = painterResource(R.drawable.whatsapp_icon), contentDescription = "Splash Screen Logo"
        , modifier = Modifier.size(80.dp)
               .align(Alignment.Center)
       )

        Column(modifier = Modifier.padding(0.dp,50.dp).align(Alignment.BottomCenter)
        , horizontalAlignment = Alignment.CenterHorizontally) {
            Text(text="From" , style = TextStyle(fontSize = 18.sp , fontWeight = FontWeight.Bold)
            )
        }
        Row(modifier = Modifier.align(Alignment.BottomCenter).padding(0.dp,30.dp)) {
            Icon(painter = painterResource(R.drawable.meta),"" ,
               tint = colorResource(R.color.meta_blue), modifier = Modifier.size(20.dp)
            )
            Spacer(modifier = Modifier.width(5.dp))
            Text(text="Meta" , style = TextStyle(fontSize = 18.sp , fontWeight = FontWeight.Bold)
            )

        }
    }

}
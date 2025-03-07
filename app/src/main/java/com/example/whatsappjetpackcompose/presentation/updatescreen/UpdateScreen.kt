package com.example.whatsappjetpackcompose.presentation.updatescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
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
import com.example.whatsappjetpackcompose.model.statusmodel.StatusModel
import com.example.whatsappjetpackcompose.presentation.bottomnavigation.BottomNavigation
import com.example.whatsappjetpackcompose.presentation.homescreen.FloatingComposable


@Composable
fun UpdateScreen(statusModel: StatusModel) {

     val statusData = listOf(
         StatusModel(R.drawable.ajay_devgn ,"Juban Kesari","Just now"),
         StatusModel(R.drawable.kartik_aaryan ,"Nillu","10:11"),
         StatusModel(R.drawable.boy ,"Murari","5:45"),
         StatusModel(R.drawable.boy ,"Murari","6:19"),
         StatusModel(R.drawable.ajay_devgn ,"Juban Kesari","Just now"),
         StatusModel(R.drawable.kartik_aaryan ,"Nillu","10:11"),
         StatusModel(R.drawable.boy ,"Murari","5:45"),
         StatusModel(R.drawable.boy ,"Murari","6:19"),

     )
    Scaffold(
        floatingActionButton = {
            FloatingComposable(R.drawable.baseline_photo_camera_24)
        } , bottomBar = {BottomNavigation()}
    )  {
        Column(modifier = Modifier.padding(it).height(500.dp)) {
            TopBar("Updates")
            HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))
            Text(text ="Status" , modifier = Modifier.padding(10.dp),
                style = TextStyle(fontWeight = FontWeight.Bold), fontSize = 22.sp)


            StatusItem(statusModel= StatusModel(R.drawable.man,"Akhilesh" , "Tap to add status update"))
            LazyColumn { items(statusData) {it->
                StatusItem(statusModel=it)
            } }
            HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))

        }


    }

}

@Preview
@Composable
private fun default() {
    UpdateScreen(statusModel = StatusModel(R.drawable.man ,"Akhilesh","Tap to add status update"))


}
package com.example.whatsappjetpackcompose.presentation.homescreen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height

import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.whatsappjetpackcompose.R
import com.example.whatsappjetpackcompose.model.chatmodel.ChatModel
import com.example.whatsappjetpackcompose.common.TopBar
import com.example.whatsappjetpackcompose.presentation.bottomnavigation.BottomNavigation

@Preview(showSystemUi = true)
@Composable
fun HomeScreen() {
    val chatData =
        listOf(ChatModel(R.drawable.boy , "Happy Singh" ,"Paise chahiye bhai" , "11:13"),
                ChatModel(R.drawable.carryminati,"Rahul Sharma", "Bhai, password '123456' nahi chal raha!", "10:01"),
    ChatModel(R.drawable.disha_patani, "Pooja Verma", "Mom's calling, act like you didn't see me!", "10:05"),
    ChatModel(R.drawable.boy3, "Amit Singh", "Bro, exam mein bhi Ctrl+C, Ctrl+V hota?", "10:10"),
    ChatModel(R.drawable.girl, "Neha Gupta", "I'm on a diet... after this samosa.", "10:15"),
    ChatModel(R.drawable.boy1, "Rohit Mehta", "Netflix and study... mostly Netflix.", "10:20"),
    ChatModel(R.drawable.girl2, "Sanya Kapoor", "Just realized, tea is my soulmate!", "10:25"),
    ChatModel(R.drawable.kartik_aaryan, "Arjun Malhotra", "Can we uninstall Monday?", "10:30"),
    ChatModel(R.drawable.man, "Priya Desai", "I need a 6-month vacation twice a year.", "10:35"),
    ChatModel(R.drawable.woman, "Vikram Rao", "Aaj ka gym kal se pakka!", "10:40"),
    ChatModel(R.drawable.img, "Simran Kaur", "My Wi-Fi went down... so did my will to live.", "10:45"),
    ChatModel(R.drawable.img, "Karan Patel", "DND: Do Not Diet.", "10:50"),
    ChatModel(R.drawable.img, "Megha Joshi", "Running late... as usual!", "10:55"),
    ChatModel(R.drawable.img, "Abhishek Tiwari", "Laptop kaam kar raha hai ya chutti pe hai?", "11:00"),
    ChatModel(R.drawable.img, "Ishika Jain", "Diet coke ke saath burger toh healthy hai na?", "11:05"),
    ChatModel(R.drawable.img, "Manish Thakur", "Kaam aise kar raha hoon jaise salary bonus milegi.", "11:10"),
    ChatModel(R.drawable.img, "Riya Sen", "If sleep was a subject, topper hoti main!", "11:15"),
    ChatModel(R.drawable.img, "Harsh Yadav", "Can I sell my emotions on OLX?", "11:20"),
    ChatModel(R.drawable.img, "Aarav Khanna", "Main offline hoon, dimaag bhi.", "11:25"),
    ChatModel(R.drawable.img, "Ananya Pillai", "Monday blues? More like Monday black and white.", "11:30"),
    ChatModel(R.drawable.img, "Kabir Bansal", "Google se puchta hoon, zindagi ka kya karoon?", "11:35")

    )

    Scaffold(
        floatingActionButton = {
            FloatingComposable(R.drawable.chat_icon)
        } , bottomBar = {BottomNavigation()}
    ) {
        Column(modifier = Modifier.padding(it)) {
            TopBar("WhatsApp" ,options=listOf(
                "New group" , "New broadcast" , "Linked devices" , "Starred messages" , "Payments" , "Settings"
            ))


            HorizontalDivider(color = Color.Gray, modifier = Modifier.alpha(0.5f))

            Spacer(modifier = Modifier.height(10.dp))
            LazyColumn { items(chatData) { it->
                ChatItem(chatModel = it)
            } }


        }
    }


}
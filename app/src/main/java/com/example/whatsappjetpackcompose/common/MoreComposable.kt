package com.example.whatsappjetpackcompose.common

import android.R.attr.x
import androidx.compose.foundation.layout.width
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.DpOffset
import androidx.compose.ui.unit.IntOffset
import androidx.compose.ui.unit.dp


@Composable
 fun MoreComposable(showMenu: Boolean  ,options: List<String>,onDismissRequest: () -> Unit ) {




    DropdownMenu(expanded = showMenu, onDismissRequest = onDismissRequest , modifier = Modifier.width(300.dp)
        , offset = DpOffset(x = 60.dp, y = 0.dp)
    )  {  // Use showMenu here
        options.forEach { option ->
            DropdownMenuItem(
                text = { Text(option) },
                onClick = {
                    onDismissRequest()
                }
            )
        }
    }

}
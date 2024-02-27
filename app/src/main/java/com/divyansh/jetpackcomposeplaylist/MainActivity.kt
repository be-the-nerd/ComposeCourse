package com.divyansh.jetpackcomposeplaylist

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Column(
                modifier = Modifier
                    .background(Color.Red)
                    .fillMaxHeight(0.5f)
                    .fillMaxWidth()
                    .padding(top = 50.dp)
                    .border(5.dp, Color.Magenta)
                    .padding(5.dp)
                    .border(5.dp, Color.Yellow)
                    .padding(5.dp)
                    .border(5.dp, Color.Blue)
//                    .width(600.dp)
//                    .requiredWidth(600.dp)

                // width -> adjust acc. to screen size
                // requiredWidth -> does not adjust acc. to screen size and can extend to out of screen
            ) {
                Text(text = "Divyansh", modifier = Modifier.offset(50.dp, 20.dp))
                //Offset with x and y
                Spacer(modifier = Modifier.height(50.dp))
                Text(
                    text = "Verma", modifier = Modifier
                        .border(5.dp, Color.Yellow)
                        .padding(5.dp)
                        .offset(20.dp, 20.dp)
                        .border(10.dp, Color.DarkGray)
                )
                Text(text = "Android", modifier = Modifier.clickable { })
            }
        }
    }
}
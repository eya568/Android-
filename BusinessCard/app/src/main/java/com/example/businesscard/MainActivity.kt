package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    BusinessCard()
                }
            }
        }
    }
}

@Composable
fun ContactInfoList() {
    Column (
        modifier = Modifier.padding(16.dp)
        ){
        ContactItem(
            icon = painterResource(R.drawable.email),
            text = "swayedaya@gmail.com"
        )
        ContactItem(
            icon = painterResource(R.drawable.phone_call),
            text = "+216-98-987-855"
        )
        ContactItem(
            icon = painterResource(R.drawable.instagram),
            text = "@eyasoyed"
        )
    }
}

@Composable
fun ContactItem(modifier: Modifier = Modifier, icon: Painter, text: String) {
    Row(
        modifier = modifier
            .fillMaxWidth(),

        verticalAlignment = Alignment.CenterVertically // Center vertically
    ) {
        Image(
            painter = icon,
            contentDescription = "Contact icon",
            modifier = Modifier.size(16.dp)
        )
        Spacer(modifier = Modifier.width(4.dp))
        Text(
            text = text,
            fontSize = 16.sp
        )
    }
}
@Composable
fun BusinessCard( modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable._3eea0a73feef414aa8ea25f52ebab50)
    Column (
        modifier = Modifier
            .fillMaxSize()

            .background(Color(0xFFF6EDFF)),

        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
    ){
        Spacer(modifier = Modifier.weight(1f))
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center,
        ) {
            Image(
                painter = image,
                contentDescription = "a cute cat drinking water from a fountain and a girl",
            )
            Text(
                text = "Soyed Eya",
                fontWeight = FontWeight.Bold,
                fontSize = 24.sp,
            )
            Text(
                text = "My Garden"
            )
        }
        Spacer(modifier = Modifier.weight(1f))
        ContactInfoList()

    }



}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardTheme {
        BusinessCard()
    }
}
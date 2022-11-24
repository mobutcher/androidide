package com.example.happbirthdaycard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp
import com.example.happbirthdaycard.ui.theme.AppTheme
import com.example.happbirthdaycard.R
import androidx.compose.foundation.Image
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.layout.padding
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.stringResource

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { 
        AppTheme {
           
           val zaun = stringResource(R.string.zaun) 
           
           val singer = stringResource(R.string.singer)
           
           BirthdayGreetingWithImage(zaun,singer) 
           
        }
    }
  }
}


@Composable
fun BirthdayGreetingWithImage(message: String, from: String){
    val image = painterResource(R.drawable.androidparty)
    Box{
       Image(
           painter = image,
           contentDescription = null,
           modifier = Modifier
           .fillMaxWidth()
           .fillMaxHeight(),
           contentScale = ContentScale.Crop)
           BirthdayGreetingWithText(message = message,from = from)
     }
    
}

@Composable
fun BirthdayGreetingWithText(message: String,from: String){
    
    Column{
        
        Text(
        text = message,
        fontSize = 18.sp,
        modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth(Alignment.CenterHorizontally)
        .padding(start = 16.dp,top = 16.dp)
        )
        
        Text(text = from,
        fontSize = 16.sp,
        modifier = Modifier
        .fillMaxWidth()
        .wrapContentWidth(Alignment.CenterHorizontally)
        .padding(start = 16.dp,end = 16.dp)
        )
   }
}
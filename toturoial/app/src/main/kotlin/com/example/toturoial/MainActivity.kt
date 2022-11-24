package com.example.toturoial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Card
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.toturoial.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { 
        AppTheme {
           
           val title = stringResource(R.string.title)
           
           val summary = stringResource(R.string.summary)
           
           val body = stringResource(R.string.body)
           
           newsGreetingWithImage(title,summary,body)
           
        }
    }
  }
}

@Composable
fun newsGreetingWithImage(title: String, summary: String, body: String){
    
    val image = painterResource(R.drawable.bg_compose_background)
    
    Column{
        
        Image(
            painter = image,
            contentDescription = null)
        
        newsGreetingWithText(title = title, summary = summary, body = body)
    
    }
    
}

@Composable
fun newsGreetingWithText(title: String, summary: String, body: String){
    
    Column{
        
        Text(
            text = title,
            fontSize = 24.sp,
            modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth()
            .padding(
            start = 16.dp,
            end = 16.dp,
            bottom = 16.dp,
            top = 16.dp)
        )
        
        Text(
            text = summary,
            textAlign = TextAlign.Justify,
            modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth()
            .padding(
            start = 16.dp,
            end = 16.dp)
        )
        
        Text(
            text = body,
            textAlign = TextAlign.Justify,
            modifier = Modifier
            .fillMaxWidth()
            .wrapContentWidth()
            .padding(
            start = 16.dp,
            end = 16.dp,
            bottom = 16.dp,
            top = 16.dp)
        )
    }
}
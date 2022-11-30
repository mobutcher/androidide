package com.compose.quadrant

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
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.background
import com.compose.quadrant.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { 
        AppTheme { 
           quadrantApp() 
        } 
    }
  }
}

@Composable
fun quadrantApp(){
    Column(modifier = Modifier.fillMaxWidth()){
        Row(modifier = Modifier.weight(1f)){
            quadrantInfo(
            title = stringResource(R.string.textTitle),
            content = stringResource(R.string.textContent),
            backgroundColor = Color.Green,
            modifier = Modifier.weight(1f))
            
            quadrantInfo(
            title = stringResource(R.string.imageTitle),
            content = stringResource(R.string.imageContent),
            backgroundColor = Color.Yellow,
            modifier = Modifier.weight(1f))
        }
        
        Row(modifier = Modifier.weight(1f)){
            quadrantInfo(
            title = stringResource(R.string.rowTitle),
            content = stringResource(R.string.rowContent),
            backgroundColor = Color.Cyan,
            modifier = Modifier.weight(1f))
            
            quadrantInfo(
            title = stringResource(R.string.colTitle),
            content = stringResource(R.string.colContent),
            backgroundColor = Color.LightGray,
            modifier = Modifier.weight(1f))
        }
    }    
}

@Composable
fun quadrantInfo(title: String, content: String, backgroundColor: Color, modifier: Modifier = Modifier){
    Column(modifier = modifier.fillMaxSize().background(backgroundColor),
    horizontalAlignment = Alignment.CenterHorizontally,
    verticalArrangement = Arrangement.Center){
            
        Text(text = title,
        modifier = Modifier.padding(bottom = 16.dp),
        fontWeight = FontWeight.Bold)
        
        Text(text = content,
        modifier = Modifier.padding(
            top = 0.dp,bottom = 16.dp, start =16.dp,end = 16.dp),
        textAlign = TextAlign.Justify)
    }
}
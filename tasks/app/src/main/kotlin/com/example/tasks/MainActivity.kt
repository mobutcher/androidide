package com.example.tasks

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.Image
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
import androidx.compose.ui.unit.dp
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.tasks.ui.theme.AppTheme

class MainActivity : ComponentActivity() {
  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContent { 
        AppTheme { 
            
            val completed = stringResource(R.string.completed)
            
            val work = stringResource(R.string.work)
            
            tasks(completed,work) 
        } 
    }
  }
}

@Preview
@Composable
fun tasks(completed: String, work: String){
      
      Column(
          modifier = Modifier.fillMaxWidth().fillMaxHeight(),
          verticalArrangement = Arrangement.Center,
          horizontalAlignment = Alignment.CenterHorizontally){
          
          Image(
              painter = painterResource(R.drawable.ic_task_completed),        
              contentDescription = null)
      
      Text(
          text = completed,
          fontSize = 24.sp,
          modifier = Modifier
          .padding(top = 24.dp,bottom = 8.dp))
      
      Text(text = work,
          fontSize = 16.sp)
      }
    
}
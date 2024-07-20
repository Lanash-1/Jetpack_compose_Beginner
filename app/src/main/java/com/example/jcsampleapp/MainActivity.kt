package com.example.jcsampleapp

import android.content.res.Configuration
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.jcsampleapp.ui.theme.JCSampleAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            JCSampleAppTheme {
                Greeting(text = "Already have an account?")
            }
        }
    }
}

@Composable
fun Greeting(text: String, modifier: Modifier = Modifier) {
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        LoginButton(buttonText = "Sign Up", modifier = modifier)
        Text(
            text = text, modifier = modifier.padding(top = 8.dp)
        )
    }
}

//@Composable
//fun LightOff() {
//
//}
//
//@Composable
//fun LightOn() {
//
//}

@Composable
fun LoginButton(buttonText: String, modifier: Modifier) {
    Button(onClick = {
        println("Button click")
    }, modifier = modifier.width(240.dp)) {
        Text(buttonText)
    }
}

@Preview(
    showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES,
    name = "Dark Mode"
)
@Composable
fun GreetingPreview() {
    JCSampleAppTheme {
        Greeting("Android")
    }
}
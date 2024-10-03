package com.example.composeappdojo

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composeappdojo.ui.theme.ComposeAppDojoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeAppDojoTheme {
                    // TextChangeBlock ()

                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Column {
                        ColorChangeBlock()
                    }
                }
            }
        }
    }
}

@Composable
fun TextChangeBlock() {

    Column {

        var name by remember { mutableStateOf("world!") }

        Text(
            text = "Hello $name"
        )
        Button(
            onClick = { name = "gfdfgklfdkl" },
        )
        {
            Text("click")
        }

    }
}

@Composable
fun ColorChangeBlock() {

    Column {

        var name by remember { mutableStateOf("world!") }

        Text(
            text = "Hello $name",
            style = TextStyle(background = Color.Yellow),

        )
        Button(
            onClick = { name = "gfdfgklfdkl" },
        )
        {
            Text("click")
        }

    }
}
@Composable
fun TextExample() {
    Text(
        style = TextStyle(background = Color.Yellow),
        modifier = Modifier.padding(20.dp),
        text = "This is a sample text. This is an example of adding background color to the text.",
        fontSize = 24.sp)
}



@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ComposeAppDojoTheme {
        TextExample()
    }
}


package com.example.happybirthday

import android.os.Bundle
import android.widget.Space
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity2 : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            val data = intent.getStringExtra("DATA")
            HappyBirthdayTheme {
                BackgroundImage()
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "FELI CUMPLEAÑOS 🥳",
                        color = Color.White,
                        fontSize = 37.sp,
                        fontWeight = FontWeight.Bold,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.padding(30.dp))
                    Row {
                        Text(
                            data ?: "" ,
                            color = Color.Magenta,
                            fontSize = 30.sp,
                            fontWeight = FontWeight.Bold
                        )
                    }
                }

            }
        }
    }
}


@Composable
fun GreetingImage(message: String, from: String, modifier: Modifier = Modifier) {

    val image = painterResource(R.drawable.happybirthday)
    Image(
        painter = image,
        contentDescription = null)

}

@Composable
fun BackgroundImage() {
    val image = painterResource(R.drawable.happybirthday)
    Image(
        painter = image,
        contentDescription = null,
        modifier = Modifier.fillMaxSize()
    )
}


@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    HappyBirthdayTheme {
        GreetingImage(
            message = "Happy Birthday Sam!",
            from = "From Emma"
        )
    }
}
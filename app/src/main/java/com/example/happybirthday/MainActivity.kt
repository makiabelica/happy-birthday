package com.example.happybirthday

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme
import androidx.compose.runtime.remember as remember

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HappyBirthdayTheme {
                Column(
                    modifier = Modifier.fillMaxSize(),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(
                        text = "Ingresa un nombre",
                        fontSize = 40.sp,
                        textAlign = TextAlign.Center
                    )
                    Spacer(modifier = Modifier.padding(30.dp))
                    var text by remember {
                        mutableStateOf("")
                    }
                    TextField(
                        value = text,
                        onValueChange = {text = it},
                        label = { Text(text = "Nombre:")}
                    )
                    Spacer(modifier = Modifier.padding(30.dp))
                    Button(onClick = {
                        val intent = Intent(this@MainActivity, MainActivity2::class.java)
                        intent.putExtra("DATA", text)
                        startActivity(intent)
                    }) {
                        Text(text = "Enviar")
                    }
                }
            }
        }
    }
}
//TODO: HACERLO CON FUNCIONES UVU Y VER EL PREVIEW
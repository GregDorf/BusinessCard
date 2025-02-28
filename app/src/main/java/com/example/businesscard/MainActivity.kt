package com.example.businesscard

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Phone
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.businesscard.ui.theme.BusinessCardTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            BusinessCardApp()
        }
    }
}

@Composable
fun BusinessCardApp() {
    BusinessCardTheme {
        Surface(modifier = Modifier.fillMaxSize(), color = MaterialTheme.colorScheme.background) {
            BusinessCardContent()
        }
    }
}

@Composable
fun BusinessCardContent() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFD2E8D4)),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        val logo: Painter = painterResource(id = R.drawable.android_logo)
        Image(
            painter = logo,
            contentDescription = null,
            modifier = Modifier
                .size(100.dp)
                .background(Color(0xFF073042))
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = "Григорьев Григорий Александрович",
            style = MaterialTheme.typography.headlineLarge,
            textAlign = TextAlign.Center
        )
        Spacer(
            modifier = Modifier.height(16.dp)
        )
        Text(
            text = "Начинающий андроид разработчик",
            style = MaterialTheme.typography.bodyLarge,
            textAlign = TextAlign.Center
        )
    }

    Column (
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth(),
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton (
                onClick = { /* TODO: Добавить функционал */ }
            ) {
                Icon (
                    Icons.Default.Phone,
                    contentDescription = "Phone"
                )
            }
            Text (
                text = "+7 (952) 403-74-29",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
            )
        }
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(
                onClick = { /* TODO: Добавить функционал */ }
            ) {
                Icon(
                    Icons.Default.Share,
                    contentDescription = "Share"
                )
            }
            Text(
                text = "@Gr0G0R",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
            )
        }
        Row (
            modifier = Modifier
                .fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Center
        ) {
            IconButton(
                onClick = { /* TODO: Добавить функционал */ }
            ) {
                Icon(
                    Icons.Default.Email,
                    contentDescription = "Email"
                )
            }
            Text(
                text = "gregdorf86@gmail.com",
                style = MaterialTheme.typography.bodyLarge,
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview
@Composable
fun DefaultPreview() {
    BusinessCardApp()
}

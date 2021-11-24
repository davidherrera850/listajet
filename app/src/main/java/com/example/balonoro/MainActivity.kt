package com.example.balonoro

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.example.balonoro.datos.BarkHomeContent
import com.example.balonoro.datos.ProfileActivity
import com.example.balonoro.datos.Futbolistas
import com.example.balonoro.ui.theme.BalonoroTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BalonoroTheme {
                // A surface container using the 'background' color from the theme
                Surface(color = MaterialTheme.colors.background) {
                    MyApp {
                        startActivity(ProfileActivity.newIntent(this, it))
                    }
                }
            }
        }
    }
}

@Composable
fun MyApp(navigateToProfile: (Futbolistas) -> Unit) {
    Scaffold(
        content = {
            BarkHomeContent(navigateToProfile = navigateToProfile)
        }
    )
}


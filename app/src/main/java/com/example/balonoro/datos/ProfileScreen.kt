package com.example.balonoro.datos

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.Divider
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ProfileScreen(futbolistas: Futbolistas) {
    val scrollState = rememberScrollState()

    Column(modifier = Modifier.fillMaxSize()) {
        BoxWithConstraints {
            Surface {
                Column(
                    modifier = Modifier
                        .fillMaxSize()
                        .verticalScroll(scrollState),
                ) {
                    ProfileHeader(
                        futbolistas,
                        this@BoxWithConstraints.maxHeight
                    )
                    Title(futbolistas)
                    Equipo(futbolistas)
                    Descripcion(futbolistas)
                }
            }
        }
    }
}

@Composable
private fun ProfileHeader(
    futbolistas: Futbolistas,
    containerHeight: Dp
) {
    Image(
        modifier = Modifier
            .heightIn(max = containerHeight / 2)
            .fillMaxWidth(),
        painter = painterResource(id = futbolistas.futbolistaImageId),
        contentScale = ContentScale.Crop,
        contentDescription = null
    )
}

@Composable
private fun Title(
    futbolistas: Futbolistas
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = futbolistas.title,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold
        )
    }
}

@Composable
fun ProfileProperty(label: String, value: String) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp)) {
        Divider(modifier = Modifier.padding(bottom = 4.dp))
        Text(
            text = label,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.caption,
        )
        Text(
            text = value,
            modifier = Modifier.height(24.dp),
            style = MaterialTheme.typography.body1,
            overflow = TextOverflow.Visible
        )
    }
}

@Composable
private fun Equipo(
    futbolistas: Futbolistas
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = futbolistas.equipo,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold,
            fontSize = 20.sp
        )
    }
}

@Composable
private fun Descripcion(
    futbolistas: Futbolistas
) {
    Column(modifier = Modifier.padding(start = 16.dp, end = 16.dp, bottom = 16.dp, top = 16.dp)) {
        Text(
            text = futbolistas.description,
            style = MaterialTheme.typography.h5,
            fontWeight = FontWeight.Bold,
            fontSize = 16.sp
            )

    }
}


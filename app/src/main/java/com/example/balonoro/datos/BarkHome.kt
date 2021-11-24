package com.example.balonoro.datos

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.unit.dp
import androidx.compose.foundation.lazy.items

class BarkHome {
}

@Composable
fun BarkHomeContent(navigateToProfile: (Futbolistas) -> Unit) {
    val futbolisties = remember { DataProvider.futbolistaList }
    LazyColumn(
        contentPadding = PaddingValues(horizontal = 16.dp, vertical = 8.dp)
    ) {
        items(
            items = futbolisties,
            itemContent = {
                FutbolistasListItem(futbolistas = it, navigateToProfile)
            })
    }
}
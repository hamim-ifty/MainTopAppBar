package com.example.maintopappbar

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavController

@Composable
fun InfoScreen(navController: NavController) {
    Scaffold(
        topBar = { ScreenTopBar("Info", navController) },
    ) { innerPadding ->
        Text(
            text = "Info Screen",
            modifier = Modifier.padding(innerPadding)
        )
    }
}
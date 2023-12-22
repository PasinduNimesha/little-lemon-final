package com.example.littlelemon

import androidx.compose.foundation.layout.Column
import androidx.compose.runtime.Composable
import androidx.compose.ui.platform.LocalContext
import androidx.navigation.NavHostController

@Composable
fun HomeScreen(navController: NavHostController) {
    Column {
        TopAppBar()
        UpperPanel(context = LocalContext.current)
        LowerPanel(navController, DishRepository.dishes)
    }
}

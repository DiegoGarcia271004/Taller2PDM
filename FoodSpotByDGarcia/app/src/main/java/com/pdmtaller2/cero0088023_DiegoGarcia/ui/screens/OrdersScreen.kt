package com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.navigation.NavController
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.Alabaster
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.NavigationBar
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.QuickSilver
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.PoppinsFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun OrdersScreen(
    navController: NavController
){
    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        "FoodSpot",
                        fontFamily = PoppinsFontFamily,
                        fontWeight = FontWeight.Bold
                    )
                },
                modifier = Modifier.fillMaxWidth(),
                colors = TopAppBarDefaults.topAppBarColors(QuickSilver)
            )
        },
        containerColor = Alabaster,
        bottomBar = {
            NavigationBar(navController)
        }
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize()
        ) {
            Text("Mis ordenes", fontFamily = PoppinsFontFamily)
        }

    }
}
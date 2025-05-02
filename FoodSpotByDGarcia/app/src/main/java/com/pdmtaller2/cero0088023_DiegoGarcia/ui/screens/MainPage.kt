package com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.Alabaster
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.Categorias
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.QuickSilver
import com.pdmtaller2.cero0088023_DiegoGarcia.model.restaurants
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.PoppinsFontFamily
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.NavigationBar
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.RestaurantCard

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainPage(
    navController: NavController
) {
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
                .fillMaxSize()
                .padding(paddingValues)
        ) {
            LazyColumn(
                modifier = Modifier
                    .weight(1f)
                    .fillMaxWidth()
            ) {
                Categorias.forEach { category ->
                    val filteredRestaurants = restaurants.filter { category in it.categories }

                    if (filteredRestaurants.isNotEmpty()) {
                        item {
                            Text(
                                text = category,
                                style = MaterialTheme.typography.titleMedium,
                                modifier = Modifier.padding(8.dp),
                                fontFamily = PoppinsFontFamily,
                                fontWeight = FontWeight.Bold
                            )
                        }

                        item {
                            LazyRow {
                                items(filteredRestaurants) { restaurant ->
                                    RestaurantCard(restaurant, navController)
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}


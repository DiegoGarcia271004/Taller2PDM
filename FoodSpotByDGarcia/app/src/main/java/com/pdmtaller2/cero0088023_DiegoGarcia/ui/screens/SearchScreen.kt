package com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.cero0088023_DiegoGarcia.model.restaurants
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.Alabaster
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.NavigationBar
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.QuickSilver
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.RestaurantCard
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.StrictBlack
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.PoppinsFontFamily

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun SearchPage(
    navController: NavController
) {

    var query by remember { mutableStateOf("") }
    val filteredItems = restaurants.filter { restaurant ->
        restaurant.menu.any { dish ->
            dish.name.contains(query, ignoreCase = true)
        }
    }.ifEmpty {
        restaurants.filter { restaurant ->
            restaurant.categories.any { category ->
                category.contains(query, ignoreCase = true)
            }
        }
    }

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
            Column(
                modifier = Modifier
                    .padding(paddingValues)
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Column(
                    modifier = Modifier
                        .padding(16.dp)
                        .fillMaxHeight(),
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    TextField(
                        value = query,
                        onValueChange = { query = it },
                        label = {
                            Text(
                                "Buscar",
                                fontFamily = PoppinsFontFamily,
                                fontWeight = FontWeight.Bold
                            )
                        },
                        colors = TextFieldDefaults.colors(
                            unfocusedContainerColor = Color(0xFFD9D9D9),
                            focusedContainerColor = Color(0xFFD9D9D9),
                            unfocusedTextColor = StrictBlack,
                            focusedTextColor = StrictBlack,
                            focusedIndicatorColor = StrictBlack,
                            focusedLabelColor = StrictBlack,
                            cursorColor = StrictBlack
                        ),
                        modifier = Modifier.fillMaxWidth()
                    )

                    Spacer(modifier = Modifier.height(15.dp))

                    Column(
                        modifier = Modifier
                            .clip(RoundedCornerShape(5.dp))
                            .background(StrictBlack)
                            .padding(20.dp)
                            .height(800.dp)
                            .fillMaxWidth()

                    ) {
                        LazyColumn(
                            modifier = Modifier
                                .background(QuickSilver)
                                .padding(30.dp)
                                .fillMaxHeight()
                                .fillMaxWidth(),
                            horizontalAlignment = Alignment.CenterHorizontally

                        ) {
                            items(filteredItems) { item ->
                                RestaurantCard(item, navController)
                            }
                        }
                    }
                }
            }
        }

    }
}
package com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens


import androidx.compose.foundation.background
import androidx.compose.foundation.border
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
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.Alabaster
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.DishCard
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.QuickSilver
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.components.StrictBlack
import com.pdmtaller2.cero0088023_DiegoGarcia.model.Restaurant
import com.pdmtaller2.cero0088023_DiegoGarcia.navigation.MainPageSerializable
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.PoppinsFontFamily


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun RestaurantScreen(
    restaurant: Restaurant,
    navController: NavController
) {

    var query by remember { mutableStateOf("") }

    val filteredItems = restaurant.menu.filter {
        it.name.contains(query, ignoreCase = true)
    }


    Scaffold(
        topBar = {
            TopAppBar(
                title = {
                    Row(
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(10.dp),
                        horizontalArrangement = Arrangement.SpaceBetween,
                        verticalAlignment = Alignment.CenterVertically
                    ) {
                        Text(
                            restaurant.name,
                            fontFamily = PoppinsFontFamily,
                            fontWeight = FontWeight.Bold
                        )
                        Button(onClick = { navController.navigate(MainPageSerializable) },
                                colors = ButtonDefaults.buttonColors(containerColor = Color.Transparent),
                                shape = RoundedCornerShape(5.dp),
                                modifier = Modifier.border(1.dp, StrictBlack, RoundedCornerShape(12.dp))
                            ) {
                            Icon(
                                imageVector = Icons.AutoMirrored.Filled.ArrowBack,
                                contentDescription = "Flecha"
                            )
                        }
                    }
                },
                modifier = Modifier.fillMaxWidth(),
                colors = TopAppBarDefaults.topAppBarColors(QuickSilver)
            )


        },
        containerColor = Alabaster
    ) { paddingValues ->
        Column(
            modifier = Modifier
                .padding(paddingValues)
                .fillMaxSize(),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(restaurant.description, fontFamily = PoppinsFontFamily)
            Column(modifier = Modifier.padding(16.dp)) {
                Row(
                    modifier = Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.CenterVertically
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

                }

                Spacer(modifier = Modifier.height(15.dp))

                Column(
                    modifier = Modifier
                        .clip(RoundedCornerShape(5.dp))
                        .background(StrictBlack)
                        .padding(20.dp)
                        .height(500.dp)
                        .fillMaxWidth()

                ) {
                    LazyColumn(
                        modifier = Modifier
                            .background(QuickSilver)
                            .padding(30.dp)
                            .fillMaxHeight()
                            .fillMaxWidth()

                    ) {
                        items(filteredItems) { item ->
                            DishCard(item)
                        }
                    }
                }
            }
        }

    }
}


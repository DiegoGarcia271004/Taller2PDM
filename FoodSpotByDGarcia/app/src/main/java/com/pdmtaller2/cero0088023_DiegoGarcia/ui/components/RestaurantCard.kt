package com.pdmtaller2.cero0088023_DiegoGarcia.ui.components

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import com.pdmtaller2.cero0088023_DiegoGarcia.model.Restaurant
import com.pdmtaller2.cero0088023_DiegoGarcia.navigation.RestaurantsPageSerializable
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.PoppinsFontFamily

@Composable
fun RestaurantCard(restaurant: Restaurant, navController: NavController) {
    Card(
        shape = RoundedCornerShape(12.dp),
        modifier = Modifier
            .padding(8.dp)
            .width(200.dp)
            .height(120.dp)
            .clickable{
                navController.navigate(RestaurantsPageSerializable(restaurant.id))
            },
        elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
    ) {
        Box {
            AsyncImage(
                model = restaurant.imageUrl,
                contentDescription = "Imagen de ${restaurant.name}",
                modifier = Modifier.fillMaxSize(),
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.BottomStart)
                    .background(
                        Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black.copy(alpha = 0.6f)
                            )
                        )
                    )
                    .padding(8.dp)

            ) {
                Text(
                    text = restaurant.name,
                    style = MaterialTheme.typography.bodyLarge.copy(color = Color.White),
                    maxLines = 1,
                    fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Normal
                )
            }
        }
    }
}
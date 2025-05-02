package com.pdmtaller2.cero0088023_DiegoGarcia.ui.components

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.pdmtaller2.cero0088023_DiegoGarcia.navigation.MainPageSerializable
import com.pdmtaller2.cero0088023_DiegoGarcia.navigation.OrdersPageSerializable
import com.pdmtaller2.cero0088023_DiegoGarcia.navigation.SearchPageSerializable
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.PoppinsFontFamily

@Composable
fun NavigationBar(navController: NavController) {
    BottomAppBar {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            Button(
                onClick = { navController.navigate(MainPageSerializable) },
                colors = ButtonDefaults.buttonColors(containerColor = AccentOrange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.height(50.dp)
            ) {
                Text(
                    "Listado", fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Bold
                )
            }

            Button(
                onClick = { navController.navigate(SearchPageSerializable) },
                colors = ButtonDefaults.buttonColors(containerColor = AccentOrange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.height(50.dp)
            ) {
                Text(
                    "Búsqueda", fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Bold
                )
            }

            Button(
                onClick = { navController.navigate(OrdersPageSerializable) },
                colors = ButtonDefaults.buttonColors(containerColor = AccentOrange),
                shape = RoundedCornerShape(5.dp),
                modifier = Modifier.height(50.dp)
            ) {
                Text(
                    "Mis Ordenes", fontFamily = PoppinsFontFamily,
                    fontWeight = FontWeight.Bold
                )
            }
        }
    }
}
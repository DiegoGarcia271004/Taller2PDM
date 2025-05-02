package com.pdmtaller2.cero0088023_DiegoGarcia.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.toRoute
import com.pdmtaller2.cero0088023_DiegoGarcia.model.restaurants
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens.MainPage
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens.OrdersScreen
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens.RestaurantScreen
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.screens.SearchPage

@Composable
fun Navigation() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = MainPageSerializable) {
        composable<MainPageSerializable> {
            MainPage(
                navController = navController
            )
        }

        composable<SearchPageSerializable> {
            SearchPage(navController)
        }

        composable<OrdersPageSerializable> {
            OrdersScreen(navController)
        }

        composable<RestaurantsPageSerializable> { backStackEntry ->
            val args = backStackEntry.toRoute<RestaurantsPageSerializable>()
            var restaurant = restaurants.find { it.id == args.restaurantid }
            if (restaurant != null){
                RestaurantScreen(restaurant, navController)
            }
        }
    }
}
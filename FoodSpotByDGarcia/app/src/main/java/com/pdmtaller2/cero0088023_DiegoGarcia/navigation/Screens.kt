package com.pdmtaller2.cero0088023_DiegoGarcia.navigation

import kotlinx.serialization.Serializable

@Serializable
object MainPageSerializable

@Serializable
object SearchPageSerializable

@Serializable
object OrdersPageSerializable

@Serializable
data class RestaurantsPageSerializable(val restaurantid: Int)

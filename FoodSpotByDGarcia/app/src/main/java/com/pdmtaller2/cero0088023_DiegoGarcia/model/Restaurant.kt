package com.pdmtaller2.cero0088023_DiegoGarcia.model

import kotlinx.serialization.Serializable

@Serializable
data class Restaurant (
    val id: Int,
    val name: String,
    val description: String,
    val imageUrl: String,
    val categories: List<String>,
    val menu: List<Dish>
)
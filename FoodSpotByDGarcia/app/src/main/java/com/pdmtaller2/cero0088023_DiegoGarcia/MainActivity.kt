package com.pdmtaller2.cero0088023_DiegoGarcia

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.pdmtaller2.cero0088023_DiegoGarcia.navigation.Navigation
import com.pdmtaller2.cero0088023_DiegoGarcia.ui.theme.FoodSpotByDGarciaTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FoodSpotByDGarciaTheme {
                Navigation()
            }
        }
    }
}

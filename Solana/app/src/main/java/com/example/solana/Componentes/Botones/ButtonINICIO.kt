package com.example.solana.Componentes.Botones

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

// Call this to add a regular button...
@Composable
fun ButtonINICIO(
    texto: String = "",
    navigateTo: String = "",
    navController: NavController
)
{
    Button(
        modifier = Modifier.padding(vertical = 12.dp),
        onClick =  {navController.navigate(navigateTo)},
        shape = RectangleShape,
        border = BorderStroke(2.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(Color.White)
    ) {
        Text(text = texto, style = TextStyle(fontSize = 15.sp, color = Color.Black))
    }
}
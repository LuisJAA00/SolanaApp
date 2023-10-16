package com.example.solana.Componentes.Botones

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun ButtonDefault(
    texto: String = "",
    navigateTo: String = "",
    navController: NavController
)
{
    Button(
        modifier = Modifier.padding(8.dp),
        onClick = {navController.navigate(navigateTo)},
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(Color(0xD4D4D4D4))
    ) {
        Text(text = texto, style = TextStyle(fontSize = 15.sp),color = Color.Black)
    }
}
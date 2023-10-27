package com.example.solana.Componentes.Textos

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.PaintingStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.solana.Pantallas.NewUser.bottomBorder
import java.time.format.TextStyle

@Composable
fun TextWithBottomLine(texto: String,modifier: Modifier = Modifier)
{
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .bottomBorder(1.dp, Color.Black)
    ){
        Text(
            text = texto,
            modifier = modifier,
            style = androidx.compose.ui.text.TextStyle(fontSize = 23.sp),
            fontWeight = FontWeight.Bold
        )

    }
}
package com.example.solana.Componentes.Textos

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.example.solana.Pantallas.NewUser.bottomBorder

@Composable
fun TextWithBottomLine(texto: String,modifier: Modifier = Modifier)
{
    Row(
        modifier = modifier
            .fillMaxWidth()
            .bottomBorder(1.dp, Color.Black)
    ){
        Text(text = texto, modifier = modifier.padding(bottom = 4.dp))

    }
}
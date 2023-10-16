package com.example.solana.Componentes.Textos

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

// call this to add a title...
@Composable
fun Titulo(
    texto: String,
    alineacion: Alignment = Alignment.Center,
    modifier: Modifier = Modifier
)
{
    Box(contentAlignment = Alignment.Center,
        modifier = Modifier.fillMaxWidth())
    {
        // sniglet
        Text(text = texto, modifier = Modifier.padding(8.dp),
            style = TextStyle(fontSize = 23.sp),
            fontWeight = FontWeight.Bold
        )
    }

}
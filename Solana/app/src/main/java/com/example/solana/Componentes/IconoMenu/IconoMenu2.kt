package com.example.solana.Componentes.IconoMenu

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.solana.R

@Composable
fun MenuIcon2(
    texto: String,
    imagen: Int,
    modifier: Modifier = Modifier
)
{
    Box(
       
    )
    {
        Row(
            modifier = modifier.fillMaxSize()
        )
        {
            Image(
                painter = painterResource(id = imagen),
                contentDescription = null,
                modifier = modifier
                    .fillMaxSize()
                    .weight(2f),
                contentScale = ContentScale.Crop
            )
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .weight(1f)
                   ,
                contentAlignment = Alignment.Center
            )
            {
                Text(
                    text = texto,
                    style = TextStyle(fontSize = 28.sp),
                    fontWeight = FontWeight.Bold,
                )
            }

        }

    }
}

@Preview
@Composable
fun showPrev2()
{
    MenuIcon(texto = "Expertos", imagen = R.drawable.images)
}
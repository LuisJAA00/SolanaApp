package com.example.solana.Componentes.ExpertCard

import androidx.compose.foundation.Image
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.solana.Componentes.Textos.TextWithBottomLine
import com.example.solana.R
import java.time.format.TextStyle


@Composable
fun ExpertCard(
    Nombre: String,
    foto: Int,
    info: String
)
{
    Row(
        modifier = Modifier
            .border(1.dp, Color.Black)
    )
    {
        Image(painter = painterResource(id = foto), contentDescription = null, modifier = Modifier.padding(8.dp))
        Column () {
            TextWithBottomLine(
                texto = Nombre,
                modifier = Modifier
                    .padding(top = 4.dp)
            )
            Text(
                text = info,
                modifier = Modifier
                    .padding(top= 4.dp)
            )
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun ShowCard()
{
    ExpertCard(Nombre = "Nombre Ejemplp", foto = R.drawable.exp1, info ="Ejemplo afuarniuaernciraenciuni" )
}
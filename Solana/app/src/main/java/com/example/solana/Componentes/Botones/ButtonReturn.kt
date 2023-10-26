package com.example.solana.Componentes.Botones

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.solana.R
import kotlin.math.round


@Composable
fun RetButt(
    onClick: () -> Unit
)
{
    Box(
        modifier = Modifier
            .background(Color.White, RoundedCornerShape(16.dp))
            .clickable { onClick }
            .border(1.dp, Color.Black, CircleShape)

    )
    {
        Image(painter = painterResource(id = R.drawable.baseline_arrow_back_ios_new_34), contentDescription = null)
    }
}

@Preview
@Composable
fun ShowButton()
{
    RetButt (
        onClick = {}
    )

}
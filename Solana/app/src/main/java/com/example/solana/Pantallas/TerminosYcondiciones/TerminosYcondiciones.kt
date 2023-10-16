package com.example.solana.Pantallas.TerminosYcondiciones

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.solana.Componentes.Botones.ButtonDefault
import com.example.solana.R

// TERMINOS Y CONDICIONES
@Composable
fun TerminosYcondiciones(
    navController: NavController,
    modifier: Modifier = Modifier

)
{
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally

    ) {
        Text("Terminos y condiciones",
            modifier = Modifier
                .padding( 16.dp),
            style = TextStyle(fontSize = 20.sp),
            fontWeight = FontWeight.Bold
        )
        Box(
            modifier = modifier
                .border(2.dp, Color.Black)
                .background(Color(0xD9D9D9D9))
        )
        {
            Text(text = stringResource(id = R.string.TerminosYCondiciones),
                modifier = Modifier.padding(8.dp),
                style = TextStyle(fontSize = 18.sp),
                textAlign = TextAlign.Justify
            )
        }
        Box (
            modifier = Modifier
                .fillMaxHeight()
                .padding(20.dp)
        ){
            Column (
                modifier = Modifier
                    .fillMaxHeight(),
                verticalArrangement = Arrangement.Bottom
            ){
                Row (modifier = modifier){
                    ButtonDefault("Aceptar","Privacidad",navController)
                }
            }
        }


    }
}
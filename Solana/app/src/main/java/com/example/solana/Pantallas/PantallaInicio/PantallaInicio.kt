package com.example.solana.Pantallas.PantallaInicio

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

import com.example.solana.Componentes.Botones.ButtonINICIO
import com.example.solana.Componentes.Textos.Titulo
import com.example.solana.R


@Composable
fun PantallaInicio(
    navController: NavController,
    modifier: Modifier = Modifier
)
{
    Column(
        modifier = modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        Image(painter = painterResource(id = R.drawable.mainlogo), contentDescription = null,
            modifier = Modifier.padding(top = 1.dp))
        Titulo("¡Hola!")
        ButtonINICIO("Log In","LogIn",navController = navController)
        ButtonINICIO("Sign up","TerminosYcondiciones",navController = navController)

    }
}



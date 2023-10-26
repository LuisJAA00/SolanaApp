package com.example.solana.Pantallas.Menu

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.solana.Componentes.Botones.RetButt
import com.example.solana.Componentes.Textos.Titulo

@Composable
fun ExpertosScreen(
    navController: NavController
)
{
    Column ()
    {
        Row (
            modifier = Modifier.padding(16.dp)
        ){
            RetButt(onClick = {navController.navigate("PantallaInicio")})
        }

        Titulo(texto = "Expertos")
    }
}


@Preview(
    showBackground = true
)
@Composable
fun showMenu()
{
    val navController = rememberNavController()
    ExpertosScreen(navController = navController)
}
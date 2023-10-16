package com.example.solana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.runtime.remember

import androidx.navigation.NavController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeGesturesPadding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CutCornerShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.ShaderBrush
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavDestinationDsl
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import com.example.solana.Pantallas.PantallaInicio.PantallaInicio
import com.example.solana.Componentes.Botones.ButtonDefault
import com.example.solana.Pantallas.Privacidad.Privacidad
import com.example.solana.ui.theme.SolanaTheme
import com.example.solana.Pantallas.TerminosYcondiciones.TerminosYcondiciones

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SolanaTheme {

                    SolanaApp()


            }
        }
    }
}

@Preview(
    showBackground = true
)
@Composable
fun ShowPrev()
{
    //PantallaInicio(PantallaInicioClickLogIn = {}, PantallaInicioClickSignUp = {})
    //TerminosYcondiciones(ClickAcepterTerminosYcondiciones = {})
    //Privacidad(ClickAceptarPrivacidad = {})
}



@Composable
fun SolanaApp()
{
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "PantallaInicio") {
        composable("PantallaInicio") {
            PantallaInicio(navController)
        }
        composable("TerminosYcondiciones")
        {
            TerminosYcondiciones(navController)
        }
        composable("Privacidad")
        {
            Privacidad(navController = navController)

        }
    }
}







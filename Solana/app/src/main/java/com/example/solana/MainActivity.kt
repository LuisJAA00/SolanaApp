package com.example.solana

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.remember

import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.ViewModel
import androidx.navigation.NavDestinationDsl
import androidx.navigation.NavHost
import androidx.navigation.compose.composable
import com.example.solana.Pantallas.PantallaInicio.PantallaInicio
import com.example.solana.Componentes.Botones.ButtonDefault

import com.example.solana.Pantallas.Expertos.ExpertsScreen
import com.example.solana.Pantallas.LogIn.LogIn
import com.example.solana.Pantallas.Menu.MenuScreen
import com.example.solana.Pantallas.NewUser.NewUser
import com.example.solana.Pantallas.Privacidad.Privacidad
import com.example.solana.ui.theme.SolanaTheme
import com.example.solana.Pantallas.TerminosYcondiciones.TerminosYcondiciones
import com.example.solana.UserViewModel.UserViewModel

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SolanaTheme {
                    val userViewModel: UserViewModel = UserViewModel()
                    SolanaApp(userViewModel)


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
fun SolanaApp(
    userViewModel: UserViewModel
)
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
        composable("NewUser")
        {
            NewUser(navController = navController,userViewModel)
        }
        composable("Expertos")
        {
            ExpertsScreen(navController = navController)
        }
        composable("Menu")
        {
            MenuScreen(navController = navController)
        }
        composable("LogIn")
        {
            LogIn(navController = navController, userViewModel = userViewModel)
        }

    }
}








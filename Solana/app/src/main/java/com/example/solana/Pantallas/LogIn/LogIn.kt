package com.example.solana.Pantallas.LogIn

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box


import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.solana.Componentes.Botones.ButtonDefault
import com.example.solana.Componentes.Botones.ButtonDefaultWithToastMssg
import com.example.solana.Componentes.DropDown.AddDropDown
import com.example.solana.Componentes.TextFields.AddTextField
import com.example.solana.Componentes.Textos.TextWithBottomLine
import com.example.solana.Componentes.Textos.Titulo


import com.example.solana.UserViewModel.UserViewModel

@Composable
fun LogIn(
    navController: NavController,
    userViewModel: UserViewModel
)
{

    // This are used to show text on texfields and add it via user view model
    var NumeroEmail by remember { mutableStateOf("") }
    var Contraseña by remember { mutableStateOf("") }


    // to check if user input is valid
    var enableButton = remember { mutableStateOf(true) }



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),

        ) {
        Titulo(texto = "Inicio de sesion", modifier = Modifier.padding(bottom = 52.dp))

        TextWithBottomLine(texto = "Accceso")
        Text(text = "", modifier = Modifier.padding(bottom = 16.dp))


            AddTextField(
                value = NumeroEmail,
                onValueChange = { NumeroEmail = it },
                "Telefono o correo",
                Icons.Default.Email,
                Color.Black,
                modifier = Modifier
                    .fillMaxWidth()
                    .align(Alignment.CenterHorizontally)
                    .padding(16.dp),
                horizontalAlignment = Alignment.Center
            )


        AddTextField(
            value = Contraseña,
            onValueChange = { Contraseña = it },
            "Contraseña",
            Icons.Default.Lock,
            Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(16.dp),
            horizontalAlignment = Alignment.Center
        )
        Text(text = "current email: ${userViewModel._userEmail}")
        Text(text = "current password: ${userViewModel._userPassword}")


        if( NumeroEmail == userViewModel._userEmail && Contraseña == userViewModel._userPassword)
        {
            enableButton.value = true
        }
        else
        {
            enableButton.value = false
        }

        Box(modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(),
            contentAlignment = Alignment.BottomCenter
        )
        {

            ButtonDefaultWithToastMssg(
                texto = "Aceptar",
                navigateTo = "Menu",
                navController = navController,
                enable = enableButton,
                mssg = "Contraseña o email incorrectos")
        }


    }

}

@Preview(
    showBackground = true
)
@Composable
fun ShowPrev() {
    val navController = rememberNavController()
    val userViewModel = UserViewModel()


    LogIn(navController = navController, userViewModel = userViewModel)
}
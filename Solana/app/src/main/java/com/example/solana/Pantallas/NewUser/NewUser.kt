package com.example.solana.Pantallas.NewUser

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.ExitToApp
import androidx.compose.material.icons.filled.Face
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Lock
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.ComposeCompilerApi
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.composed
import androidx.compose.ui.draw.drawBehind
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.Dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.solana.Componentes.Botones.ButtonDefault
import com.example.solana.Componentes.Botones.ButtonDefaultWithToastMssg
import com.example.solana.Componentes.DropDown.AddDropDown
import com.example.solana.Componentes.TextFields.AddTextField
import com.example.solana.Componentes.Textos.TextWithBottomLine
import com.example.solana.Componentes.Textos.Titulo
import com.example.solana.Pantallas.PantallaInicio.PantallaInicio
import com.example.solana.UserViewModel.UserViewModel


@Preview(
    showBackground = true
)
@Composable
fun jijija()
{
    val navController = rememberNavController()
    val userViewModel: UserViewModel = UserViewModel()
    NewUser(navController = navController,userViewModel)
}


@OptIn(ExperimentalMaterial3Api::class)

@Composable
fun NewUser(
    navController: NavController,
    userViewModel: UserViewModel
)
{
    // This are used to show text on texfields and add it via user view model
    var NombreCompleto by remember { mutableStateOf("") }
    var NumeroEmail by remember { mutableStateOf("") }
    var Contraseña by remember { mutableStateOf("") }
    var Folio by remember { mutableStateOf("") }

    // this is use to save the state of the dropdown menu
    var selectedOption = remember { mutableStateOf("") }

    // to check if user input is valid
    var enableButton = remember { mutableStateOf(true)}



    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(20.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp),

    ) {
        Titulo(texto = "Registro de usuario", modifier = Modifier.padding(bottom = 52.dp))
        TextWithBottomLine(texto = "Nombre Completo")


        AddTextField(
            value = NombreCompleto,
            onValueChange = { NombreCompleto = it },
            "Basic information",
            Icons.Default.Person,
            Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.TopStart
        )


        TextWithBottomLine(texto = "Accseso")


        AddTextField(
            value = NumeroEmail,
            onValueChange = { NumeroEmail = it },
            "Telefono o correo",
            Icons.Default.Email,
            Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.TopStart
        )
        AddTextField(
            value = Contraseña,
            onValueChange = { Contraseña = it },
            "Contraseña",
            Icons.Default.Lock,
            Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.TopStart
        )


        TextWithBottomLine(texto = "Detalles del paciente")

        AddTextField(
            value = Folio,
            onValueChange = { Folio = it },
            "Numero de folio del paciente",
            Icons.Default.Info,
            Color.Black,
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.White),
            horizontalAlignment = Alignment.TopStart
        )

        val CancerOptions = listOf("Option 1", "Option 2", "Option 3")
        AddDropDown(
            text = "Cancer type",
            selectedOption = selectedOption,
            listaOpciones = CancerOptions,
            )


        if( NombreCompleto =="" || NumeroEmail == "" || Contraseña =="" || Folio == "" || selectedOption.value == "")
        {
            enableButton.value = false
        }
        else
        {
            userViewModel.setName(NombreCompleto)
            userViewModel.setEmail(NumeroEmail)
            userViewModel.setPass(Contraseña)
            userViewModel.setFolio(Folio)
            userViewModel.setCancerType(selectedOption.value)
            enableButton.value = true
        }
        Box(modifier = Modifier
            .fillMaxWidth(),
            contentAlignment = Alignment.Center)
        {


            Box(modifier = Modifier
                .fillMaxWidth()
                .fillMaxHeight(),
                contentAlignment = Alignment.BottomCenter
            )
            {

                ButtonDefault(
                    texto = "Aceptar",
                    navigateTo = "Menu",
                    navController = navController,
                    enable = enableButton)
            }

        }


    }
}

fun Modifier.bottomBorder(strokeWidth: Dp, color: Color) = composed(
    factory = {
        val density = LocalDensity.current
        val strokeWidthPx = density.run { strokeWidth.toPx() }

        Modifier.drawBehind {
            val width = size.width
            val height = size.height - strokeWidthPx/2

            drawLine(
                color = color,
                start = Offset(x = 0f, y = height),
                end = Offset(x = width , y = height),
                strokeWidth = strokeWidthPx
            )
        }
    }
)




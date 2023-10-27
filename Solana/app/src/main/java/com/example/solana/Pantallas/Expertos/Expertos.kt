package com.example.solana.Pantallas.Expertos

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.solana.Componentes.Botones.RetButt
import com.example.solana.Componentes.ExpertCard.ExpertCard
import com.example.solana.Componentes.Textos.Titulo
import com.example.solana.R

@Composable
fun Expertos(
    navController: NavController,
    experts: List<ExpertInfo>
)
{
    Column ()
    {
        Row (
            modifier = Modifier.padding(12.dp)
        ){
            RetButt(onClick = {navController.navigate("PantallaInicio")})
        }

        Titulo(texto = "Expertos")


        LazyColumn {
            items(experts.size) { index ->
                ExpertCard(Nombre = experts.get(index)._Nombre, foto = experts.get(index)._foto, info = experts.get(index)._Info)
            }
        }
        ExpertCard(Nombre = "Nombre", foto = R.drawable.exp1, info = "Info ejemplo")

    }
}

data class ExpertInfo(val _Nombre:String,val _foto:Int,val _Info:String)





@Composable
fun ExpertsScreen(
    navController: NavController,

)
{
    val listaExpertos = listOf<ExpertInfo>(
        ExpertInfo("NombreEj",R.drawable.exp1,"someInfo"),
        ExpertInfo("NombreEj",R.drawable.exp1,"someInfo"),
        ExpertInfo("NombreEj",R.drawable.exp1,"someInfo"),
        ExpertInfo("NombreEj",R.drawable.exp1,"someInfo")
    )

    Expertos(navController = navController,listaExpertos)
}


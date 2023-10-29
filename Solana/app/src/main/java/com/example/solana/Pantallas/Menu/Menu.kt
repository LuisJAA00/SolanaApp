package com.example.solana.Pantallas.Menu

import android.view.Menu
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.isDebugInspectorInfoEnabled
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.example.solana.Componentes.Botones.RetButt
import com.example.solana.Componentes.ExpertCard.ExpertCard
import com.example.solana.Componentes.IconoMenu.MenuIcon
import com.example.solana.Componentes.Textos.Titulo
import com.example.solana.R

@Composable
fun Menu(
    navController: NavController,
    iconos: List<MenuItemList>
)
{
    Column ()
    {
        Titulo(texto = "Menu")

        LazyColumn(
            modifier = Modifier

                .fillMaxWidth(),

            verticalArrangement = Arrangement.Center
        ) {
            items(iconos.chunked(2)) { pairOfIcons ->
                // Each pair of icons is wrapped in a Row
                Row(
                    Modifier
                        .fillMaxWidth()
                        .padding(bottom = 40.dp),
                    horizontalArrangement = Arrangement.Center,

                ) {
                    for (icon in pairOfIcons) {
                        Box(modifier = Modifier
                            .padding(start = 20.dp)
                            .padding(end = 20.dp)

                        )
                        {
                            MenuIcon(texto = icon.texto, imagen = icon.imagen)
                        }

                    }
                }
            }
        }


    }
}

data class MenuItemList(val texto: String, val imagen:Int)




@Composable
fun MenuScreen(
    navController: NavController
)
{



    val listaIconos = listOf<MenuItemList>(
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
        MenuItemList("Expertos",R.drawable.images),
    )


    Menu(navController = navController,listaIconos)
}

@Preview(
    showBackground = true
)
@Composable
fun ShowPrev()
{
    val navController = rememberNavController()
    
    MenuScreen(navController = navController)
}
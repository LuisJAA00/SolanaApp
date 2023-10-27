package com.example.solana.Pantallas.Menu

import android.view.Menu
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.isDebugInspectorInfoEnabled
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
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
                .padding(8.dp),
            contentPadding = PaddingValues(8.dp),
            verticalArrangement = Arrangement.Center
        )
        {
            items(iconos.size) { index ->

                Row (Modifier.padding(12.dp)){
                    MenuIcon(texto = iconos.get(index).texto, imagen = iconos.get(index).imagen)
                    if(iconos.get(index+1) != null)
                    {
                        MenuIcon(texto = iconos.get(index+1).texto, imagen = iconos.get(index+1).imagen)
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
    )


    Menu(navController = navController,listaIconos)
}
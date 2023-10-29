package com.example.solana.Componentes.Botones

import android.widget.Toast



import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.solana.MainActivity
import com.example.solana.SolanaApp
import java.security.AccessController.getContext


// This button is supposed to be used to navigate the app, it will prompt a toast messg if needed
@Composable
fun ButtonDefaultWithToastMssg(
    texto: String,
    navigateTo: String,
    navController: NavController,
    enable: MutableState<Boolean> = mutableStateOf(true),
    mssg: String
)
{
    val context = LocalContext.current
    val message = mssg
    val duration = Toast.LENGTH_SHORT // You can change this to Toast.LENGTH_LONG if needed
    val toast = Toast.makeText(context, message, duration)

    Button(
        modifier = Modifier.padding(8.dp),
        onClick = {
            if(enable.value)
            {
                navController.navigate(navigateTo)
            }
            else
            {
                toast.show()
            }
                  },
        shape = RoundedCornerShape(6.dp),
        border = BorderStroke(1.dp, Color.Black),
        colors = ButtonDefaults.buttonColors(Color(0xFF846DF7))
    ) {
        Text(text = texto, style = TextStyle(fontSize = 17.sp),color = Color.White)
    }
}
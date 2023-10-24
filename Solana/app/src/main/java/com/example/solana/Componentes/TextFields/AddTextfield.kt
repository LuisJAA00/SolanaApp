package com.example.solana.Componentes.TextFields

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp



@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTextfield(
    externalText: MutableState<String>,
    color: Color,
    text: String,
    icono: ImageVector
) {



    TextField(
        value = externalText.value,
        onValueChange = {NewValue ->
            externalText.value = NewValue

        },
        modifier = Modifier.padding(top = 20.dp),
        label = { Text(text = text) },
        leadingIcon = {
            Icon(
                imageVector = icono,
                contentDescription = "Email icon",
                tint = color
            )

        },
        colors = TextFieldDefaults.textFieldColors(
            unfocusedLabelColor = color,
            cursorColor = color,
            focusedLabelColor = color,
            textColor = color,
            containerColor = color.copy(.2f),
            focusedIndicatorColor = color,
            unfocusedIndicatorColor = color.copy(
                0.5f
            )
        ),
    )



}
package com.example.solana.Componentes.DropDown

import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.material3.DropdownMenu
import androidx.compose.material3.DropdownMenuItem
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.MutableState
import androidx.compose.runtime.RememberObserver
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import kotlin.math.exp


@Composable
fun AddDropDown(
    text: String,
    selectedOption: MutableState<String>,
    listaOpciones: List<String>
)
{
    var expanded by remember { mutableStateOf(false)}
    Box(
        modifier = Modifier
            .wrapContentSize()
            .border(1.dp, Color.Gray)
            .clickable { expanded = !expanded }
    ) {
        Row(
            modifier = Modifier,

            verticalAlignment = Alignment.CenterVertically
        )
        {
            Text(text = "$text: ${selectedOption.value}",
                modifier = Modifier
                    .padding(16.dp),
                fontWeight = FontWeight.Bold,

                )
            IconButton(
                onClick = {expanded = true},


                ) {
                Icon(imageVector = Icons.Default.ArrowDropDown, contentDescription = null)
            }
        }
    }

    DropdownMenu(
        expanded = expanded,
        onDismissRequest = {expanded = false},

        ) {
        for (option in listaOpciones) {
            DropdownMenuItem(text = { Text(text = option) }, onClick = { selectedOption.value = option; expanded = false}  )
        }
    }
}
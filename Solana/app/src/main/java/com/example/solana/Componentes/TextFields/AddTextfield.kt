package com.example.solana.Componentes.TextFields

import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.unit.dp
import org.intellij.lang.annotations.JdkConstants.HorizontalAlignment


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AddTextField(
    value: String,
    onValueChange: (String) -> Unit,
    labelText: String,
    icon: ImageVector,
    color: Color,
    modifier: Modifier,
    horizontalAlignment: Alignment
) {

    Box(
        modifier = modifier,
        contentAlignment = horizontalAlignment
    ) {
        Box(
            modifier = Modifier
                .border(1.dp, Color.Black, shape = RoundedCornerShape(4.dp))
        ) {
            TextField(
                value = value,
                onValueChange = onValueChange,
                label = { Text(text = labelText) },
                leadingIcon = {
                    Icon(
                        imageVector = icon,
                        contentDescription = "Icon",
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
                    unfocusedIndicatorColor = color.copy(0.5f)
                )
            )
        }
    }
}
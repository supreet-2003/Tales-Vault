package com.kmp.arandomroom.ui.features.composables

import androidx.compose.foundation.border
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun PromptTextField(
    isEnabled: Boolean,
    inputText: String,
    onInputChanged: (String) -> Unit,
    modifier: Modifier = Modifier,
    placeholder: String = "Go east"
) {
    OutlinedTextField(
        modifier = modifier
            .border(
                width = 1.dp,
                color = MaterialTheme.colorScheme.primary,
                shape = RoundedCornerShape(10.dp)
            ),
        enabled = isEnabled,
        maxLines = 5,
        textStyle = MaterialTheme.typography.bodyMedium.copy(color = MaterialTheme.colorScheme.onSurface),
        value = inputText,
        shape = RoundedCornerShape(10.dp),
        onValueChange = { onInputChanged(it) },
        placeholder = {
            Text(
                text = placeholder,
                style = MaterialTheme.typography.bodyMedium.copy(
                    color = MaterialTheme.colorScheme.onSurface.copy(
                        alpha = 0.6f
                    )
                )
            )
        }
    )
}
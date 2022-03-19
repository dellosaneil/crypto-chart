package com.example.compose.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun ProvideResources(
    content: @Composable () -> Unit
) {
    CompositionLocalProvider(
        provideComposeTypographyProvider(),
        content = content
    )
}

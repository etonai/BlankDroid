package com.pseddev.blankdroid.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable

private val BlankDroidColorScheme = darkColorScheme(
    primary = PrimaryColor,
    secondary = SecondaryColor,
    tertiary = AccentColor,
    background = DarkBackground,
    surface = SurfaceColor,
    onPrimary = OnBackground,
    onSecondary = OnBackground,
    onTertiary = OnBackground,
    onBackground = OnBackground,
    onSurface = OnSurface,
)

@Composable
fun BlankDroidTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = BlankDroidColorScheme,
        content = content,
    )
}

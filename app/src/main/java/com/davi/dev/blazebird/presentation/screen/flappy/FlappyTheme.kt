package com.davi.dev.blazebird.presentation.screen.flappy

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.davi.dev.blazebird.presentation.theme.shapes

@Composable
fun FlappyBirdTheme(content: @Composable() () -> Unit) {
    val colors = lightColorScheme(
        primary = lightGreen,
        primaryContainer = darkGreen,
        secondary = lightGreen,
        surface = skyColor,
        background = brown,
        onBackground = Color.White,
        onSurface = Color.White
    )

    val typography = Typography(
        headlineMedium = TextStyle(
            fontWeight = FontWeight.Normal,
            fontSize = 16.sp
        ),
        bodyMedium = TextStyle(
            fontWeight = FontWeight.Bold,
            fontSize = 24.sp
        ),
    )

    MaterialTheme(
        colorScheme = colors,
        typography = typography,
        shapes = shapes,
        content = content
    )
}
package com.example.ui.theme

import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.dynamicDarkColorScheme
import androidx.compose.material3.dynamicLightColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val DarkColorScheme = darkColorScheme(
    primary = HydroDarkPrimary,
    onPrimary = HydroGreenDark,
    primaryContainer = HydroGreenDark,
    onPrimaryContainer = HydroMint,
    secondary = HydroDarkSecondary,
    onSecondary = HydroWaterDark,
    tertiary = HydroDarkTertiary,
    background = HydroDarkBackground,
    surface = HydroDarkSurface,
    surfaceVariant = HydroDarkSurfaceVariant,
    onBackground = Color(0xFFE2EBE2),
    onSurface = Color(0xFFE2EBE2),
    onSurfaceVariant = Color(0xFFC0CEC0)
)

private val LightColorScheme = lightColorScheme(
    primary = HydroGreenPrimary,
    onPrimary = Color.White,
    primaryContainer = HydroMint,
    onPrimaryContainer = HydroGreenDark,
    secondary = HydroWaterTeal,
    onSecondary = Color.White,
    secondaryContainer = HydroWaterSoft,
    onSecondaryContainer = HydroWaterDark,
    tertiary = FruitTomatoRed,
    onTertiary = Color.White,
    background = BackgroundLight,
    surface = SurfaceLight,
    surfaceVariant = SurfaceVariantLight,
    onBackground = TextPrimary,
    onSurface = TextPrimary,
    onSurfaceVariant = TextSecondary
)

@Composable
fun MyApplicationTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    dynamicColor: Boolean = false, // Use our handcrafted botanical hydroponic theme
    content: @Composable () -> Unit,
) {
    val colorScheme = when {
        dynamicColor && Build.VERSION.SDK_INT >= Build.VERSION_CODES.S -> {
            val context = LocalContext.current
            if (darkTheme) dynamicDarkColorScheme(context) else dynamicLightColorScheme(context)
        }
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}

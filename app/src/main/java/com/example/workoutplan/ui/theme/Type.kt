package com.example.workoutplan.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Typography
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.workoutplan.R

val bebas_sneue = FontFamily(
    Font(R.font.bebasneue_regular),
    Font(R.font.bebasneue_regular, FontWeight.Bold)
)


// Set of Material typography styles to start with
val Typography = Typography(
        headlineLarge = TextStyle(
        fontFamily = bebas_sneue,
        fontWeight = FontWeight.Bold,
        fontSize = 22.sp,
        letterSpacing = 2.sp
    ),
    headlineMedium = TextStyle(
        fontFamily = bebas_sneue,
        fontWeight = FontWeight.Bold,
        fontSize = 25.sp,
        letterSpacing = 1.sp
    ),
    bodyLarge = TextStyle(
        fontFamily = bebas_sneue,
        fontWeight = FontWeight.Bold,
        fontSize = 30.sp,
        letterSpacing = 3.sp
    ),
    bodyMedium = TextStyle(
        fontFamily = bebas_sneue,
        fontWeight = FontWeight.W400,
        fontSize = 20.sp,
        letterSpacing = 2.sp,

    )

)
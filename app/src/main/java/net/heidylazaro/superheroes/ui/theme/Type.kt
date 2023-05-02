package net.heidylazaro.superheroes.ui.theme



import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import net.heidylazaro.superheroes.R

val cabin = FontFamily(
    Font(R.font.cabin_regular, FontWeight.Normal),
    Font(R.font.cabin_bold, FontWeight.Bold)
)
// Set of Material typography styles to start with
val Typography = Typography(

    bodyLarge = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 14.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    ),

    displayLarge = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Normal,
        fontSize = 15.sp
    ),
    displayMedium = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp
    ),
    displaySmall = TextStyle(
        fontFamily = cabin,
        fontWeight = FontWeight.Bold,
        fontSize = 10.sp
    )
)

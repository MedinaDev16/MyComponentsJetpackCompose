package com.medinadev.mycomponents.custom

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.text.selection.SelectionContainer
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomText() {
    //texts
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFF1E1E2E)),
        verticalArrangement = Arrangement.spacedBy(18.dp, Alignment.CenterVertically),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        CustomTextColor()
        CustomTextColorGradient()
        CustomTextShadow()
        CustomTextSelect()
        CustomTextMultiStyles()
    }
}

@Composable
fun CustomTextBase(text: String, style: TextStyle) {
    Text(
        text = text,
        style = TextStyle(
            fontSize = 60.sp,
            fontWeight = FontWeight.Bold,
            color = Color.White
        ).merge(style)
    )
}

@Composable
fun CustomTextColor() {
    CustomTextBase(text = "Hello text \uD83D\uDE00", style = TextStyle(
        color = Color(0xff0ccda3)
    ))
}

@Composable
fun CustomTextColorGradient() {
    CustomTextBase(text = "Gradient Text", style = TextStyle(
        // color list
        brush = Brush.linearGradient(
            colors = listOf(Color(0xff7928CA), Color(0xffFF0080))
        )
    )
    )
}

@Composable
fun CustomTextShadow() {
    CustomTextBase(text = "Shadow Text", style = TextStyle(
        color = Color(0xFFFB5607),
        shadow = Shadow(
            color = Color(0xFFEE6055), offset = Offset(3f, 15f), blurRadius = 20f
        )
    )
    )
}

@Composable
fun CustomTextSelect() {
    SelectionContainer {
        CustomTextBase(text = "Select text", style = TextStyle(
            color = Color(0xff6610F2)
        )
        )
    }
}

@Composable
fun CustomTextMultiStyles() {
    val style = SpanStyle(
        fontSize = 60.sp,
        fontWeight = FontWeight.Bold
    )

    Text(
        buildAnnotatedString {
            withStyle(style = style.merge(SpanStyle(color=Color(0xFFD9D9D9)))) {
                append("M")
            }

            withStyle(style = SpanStyle(color=Color.Yellow)) {
                append("ulti ")
            }

            withStyle(style = style.merge(
                SpanStyle(Brush.linearGradient(
                    colors = listOf(Color.Cyan, Color.Yellow)
            ))
            )) {
                append("Styles \uD83D\uDE01")
            }

        }
    )
}















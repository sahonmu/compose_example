package com.sahonmu.compose.ui.component

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.sp

@Composable
fun BaseText(modifier: Modifier = Modifier, text: String, textSize: TextUnit = 15.sp, textColor: Color = Color.Black) {
    Text(
        modifier = modifier,
        text = text,
        color = textColor,
        fontSize = textSize
    )
}

@Composable
fun BaseText(modifier: Modifier = Modifier, text: String, textStyle: TextStyle, textColor: Color = Color.Black) {
    Text(
        modifier = modifier,
        text = text,
        color = textColor,
        style = textStyle
    )
}

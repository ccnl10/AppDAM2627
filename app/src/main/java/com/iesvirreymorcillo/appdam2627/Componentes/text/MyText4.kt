package com.iesvirreymorcillo.appdam2627.Componentes.text

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyText4(text: String, modifier: Modifier) {
    Text(
        text = text,
        modifier =  modifier
            .background(Color.Yellow)
            .border(2.dp, Color.Red)
            .padding(20.dp)

            .fillMaxWidth(),
        color = Color.Blue,
        fontSize = 30.sp,
        textAlign = TextAlign.Right
    )
}
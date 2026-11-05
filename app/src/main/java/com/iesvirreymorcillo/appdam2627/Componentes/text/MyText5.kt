package com.iesvirreymorcillo.appdam2627.Componentes.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyText5(text: String, modifier: Modifier) {
    Text(
        text = text,
        modifier = modifier
            .size(400.dp)
            .clip(RoundedCornerShape(50.dp)) // Redondea los bordes
            .background(Color.Green)
            .padding(30.dp),
        fontSize = 30.sp
    )

    Text(
        text = text,
        modifier = modifier
            .padding(top = 150.dp, start = 20.dp)
            //.fillMaxWidth()
            .size(200.dp)
           // .fillMaxWidth()
            .clip(RoundedCornerShape(50.dp)) // Redondea los bordes
            .background(Color.Gray)
            .padding(30.dp)
    )
}
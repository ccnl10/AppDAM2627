package com.iesvirreymorcillo.appdam2627.Componentes.box

import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun EjemploBox7(modifier: Modifier = Modifier) {
    // Box principal: ocupa toda la pantalla y coloca a sus hijos con align()
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(Color(0xFFFAFAFA))
            .padding(10.dp)
    ) {
        // Las cuatro cajas azules, una en cada esquina
        CajaEsquina("TopStart", Modifier.align(Alignment.TopStart))
        CajaEsquina("TopEnd", Modifier.align(Alignment.TopEnd))
        CajaEsquina("BottomStart", Modifier.align(Alignment.BottomStart))
        CajaEsquina("BottomEnd", Modifier.align(Alignment.BottomEnd))

        // Caja negra central
        Box(
            modifier = Modifier
                .align(Alignment.Center)
                .fillMaxWidth(0.8f)
                .height(112.dp)
                .background(Color.Black, RoundedCornerShape(16.dp))
                .border(4.dp, Color.Red, RoundedCornerShape(16.dp)),
            contentAlignment = Alignment.Center
        ) {
            Text(
                text = "Texto del Box 6",
                color = Color.Yellow,
                fontSize = 26.sp
            )
        }
    }
}

@Composable
fun CajaEsquina(texto: String, modifier: Modifier = Modifier) {
    // Caja azul cuadrada (casi la mitad del ancho) con el texto centrado
    Box(
        modifier = modifier
            .fillMaxWidth(0.485f)
            .aspectRatio(1f)
            .clip(RoundedCornerShape(12.dp))
            .background(Color.Blue),
        contentAlignment = Alignment.Center
    ) {
        // El borde rojo va en el modificador del propio Text
        Text(
            text = texto,
            color = Color.White,
            fontSize = 20.sp,
            modifier = Modifier
                .border(4.dp, Color.Red, RoundedCornerShape(12.dp))
                .padding(12.dp)
        )
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun PreviewMyBox7() {
    EjemploBox7()
}
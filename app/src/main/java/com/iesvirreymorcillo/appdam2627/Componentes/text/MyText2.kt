package com.iesvirreymorcillo.appdam2627.Componentes.text

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun MyText2(text: String) {
    Text(
        text = text,
        modifier = Modifier
            // Estos padding son como el margin en CSS
            .padding(top = 20.dp)      // Espacio superios hasta el "cuadro de texto"
            .padding(start = 0.dp)     // Espacio izquierdo hasta el "cuadro de texto"
            .padding(end = 50.dp)      // Espacio derecho hasta el "cuadro de texto"
            .padding(bottom = 10.dp)   // Espacio inferior hasta el "cuadro de texto"
            //.padding (10.dp)
            .fillMaxWidth()           // ocupa todo el ancho
            .fillMaxHeight()         // ocupa toda la altura
            //.fillMaxSize()             // ocupa toda la pantalla
            .background(Color.Green)        // fondo verde
            // estos padding son como el padding en CSS
            .padding(top = 50.dp)      // espacio superior
            .padding(bottom = 10.dp),  // espacio interior
        color = Color.Blue,
        fontSize = 30.sp,
        textAlign = TextAlign.Center        // centra el texto horizontalmente
    )
}

@Preview
@Composable
fun MyTestText2() {
    MyText2(text = "Hola programador desde MyTesText2")
}
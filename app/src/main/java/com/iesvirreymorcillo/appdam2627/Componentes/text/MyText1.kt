package com.iesvirreymorcillo.appdam2627.Componentes.text

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview


@Composable
fun MyText1(text: String = "Sin texto") {
    Text(text = text )
}


@Preview
@Composable
fun MyTestText1() {
    MyText1(text = "Hola programador desde MyTesText1")
}
package com.iesvirreymorcillo.appdam2627

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.iesvirreymorcillo.appdam2627.Componentes.text.MyText4
import com.iesvirreymorcillo.appdam2627.ui.theme.AppDAM2627Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            AppDAM2627Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->

                    MyText4("Cristian", modifier = Modifier.padding(innerPadding))

                }
            }
        }
    }
}


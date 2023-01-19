package com.example.registroocupaciones.ui.theme.Registros

import android.annotation.SuppressLint
import android.graphics.Paint
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp





@SuppressLint("UnrememberedMutableState")
@Composable
fun Ocupaciones() {
    val Descripción = mutableStateOf("")
    val Salario = mutableStateOf("")

    Column(modifier = Modifier) {
        Spacer(modifier = Modifier.padding(110.dp))
        Text(
            text = "Registro Ocupaciones", fontSize = 27.sp,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )

        Column(modifier = Modifier.fillMaxWidth()) {
            TextField(
                value = Descripción.value,
                onValueChange = { Descripción.value = it },
                label = { Text("Descripción") },
                modifier = Modifier.fillMaxWidth()
            )
            TextField(
                value = Salario.value,
                onValueChange = { Salario.value = it },
                label = { Text("Salario") },
                modifier = Modifier.fillMaxWidth()
            )
            Column(
                modifier = Modifier.fillMaxWidth(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Button(onClick = {})
                { Text("Guardar") }
            }

        }
    }
}





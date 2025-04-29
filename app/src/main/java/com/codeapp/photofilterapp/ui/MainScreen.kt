package com.codeapp.photofilterapp.ui

import android.util.Log
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import com.codeapp.photofilterapp.viewmodel.PhotoFilterViewModel

@Composable
fun MainScreen(viewModel: PhotoFilterViewModel) {

    val filteredImageUrl by viewModel.filteredImageUrl.collectAsState()

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Button(onClick = {
            viewModel.applyFilter(" https://picsum.photos/300")
        }) {
            Text("Aplicar Filtro")
        }

        Spacer(modifier = Modifier.height(24.dp))

        filteredImageUrl?.let { url ->
            Image(
                painter = rememberAsyncImagePainter(url),
                contentDescription = "Imagem Filtrada",
                modifier = Modifier.size(300.dp)
            )
            Log.d("MainScreen", "Imagem Filtrada: $url")
        }
    }
}